package helper;

import data.PatientData;
import gui.ButtonPanel;
import gui.InputPanel;
import gui.PatientListViewPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UIMediator implements DocumentListener {


    private InputPanel inputPanel;
    private ButtonPanel btnPanel;
    private PatientListViewPanel patientListViewPanel;
    private PatientData patientData;


    public UIMediator(InputPanel inputPanel, ButtonPanel btnPanel, PatientListViewPanel patientListViewPanel) {
        this.inputPanel = inputPanel;
        this.btnPanel = btnPanel;
        this.patientListViewPanel = patientListViewPanel;
        registerDocListeners();
        btnPanel.getSaveBtn().addActionListener(this :: addingPatientDataToTable);
    }

    private void addingPatientDataToTable(ActionEvent actionEvent) {
        patientData = new PatientData();
        patientData.setName(inputPanel.getNameTxtFld().getText());
        patientData.setAddress(inputPanel.getAddressTxtArea().getText());
        patientData.setPhoneNumber(inputPanel.getPhoneTxtFld().getText());
        patientData.setEmpType(inputPanel.getEmpStatusDropDown().getSelectedItem().toString());
        patientListViewPanel.addPatientDataToModel(patientData);

    }


    private void registerDocListeners() {
        inputPanel.getNameTxtFld().getDocument().addDocumentListener(this);
        inputPanel.getPhoneTxtFld().getDocument().addDocumentListener(this);
        inputPanel.getAddressTxtArea().getDocument().addDocumentListener(this);
    }

    private void docChanged() throws BadLocationException {


        if (inputPanel.getNameTxtFld().getDocument().getLength() > 0) {
            btnPanel.getSaveBtn().setEnabled(true);
        }

        String regex = "[0-9]+";
        Document phoneDoc = inputPanel.getPhoneTxtFld().getDocument();
        if (!phoneDoc.getText(0,phoneDoc.getLength()).matches(regex) &&  inputPanel.getPhoneTxtFld().getText().length()!=0){
            JOptionPane.showMessageDialog(this.inputPanel,"Please use only numbers");

        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            docChanged();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try {
            docChanged();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        try {
            docChanged();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }


}
