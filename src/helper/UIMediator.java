package helper;

import data.PatientData;
import gui.ButtonPanel;
import gui.InputPanel;
import gui.PatientListView;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UIMediator implements DocumentListener {


    JPanel inputPanel;
    JPanel btnPanel;
    JPanel patientListView;


    public UIMediator(JPanel inputPanel, JPanel btnPanel, JPanel patientListView) {
        this.inputPanel = inputPanel;
        this.btnPanel = btnPanel;
        this.patientListView=patientListView;
        registerDocListeners();
        registerButtonActionListeners();
    }


    private void registerDocListeners() {
        ((InputPanel) inputPanel).getNameTxtFld().getDocument().addDocumentListener(this);
        ((InputPanel) inputPanel).getPhoneTxtFld().getDocument().addDocumentListener(this);
        ((InputPanel) inputPanel).getAddressTxtArea().getDocument().addDocumentListener(this);
    }

    private void registerButtonActionListeners()
    {
        ((ButtonPanel) btnPanel).getSaveBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PatientData patientData = new PatientData();
                patientData.setName(((InputPanel) inputPanel).getNameTxtFld().getText());
                patientData.setAddress(((InputPanel) inputPanel).getAddressTxtArea().getText());
                patientData.setPhoneNumber(((InputPanel) inputPanel).getPhoneTxtFld().getText());
                patientData.setEmpType(((InputPanel) inputPanel).getEmpStatusDropDown().getSelectedItem().toString());

                ((PatientListView)patientListView).addPatientDataToModel(patientData);


            }
        });

    }


    private void docChanged() throws BadLocationException {


        if (((InputPanel) inputPanel).getNameTxtFld().getDocument().getLength() > 0) {
            ((ButtonPanel) btnPanel).getSaveBtn().setEnabled(true);
        }

        String regex = "[0-9]+";
        Document phoneDoc = ((InputPanel) inputPanel).getPhoneTxtFld().getDocument();
        if (!phoneDoc.getText(0,phoneDoc.getLength()).matches(regex) && ((InputPanel) inputPanel).getPhoneTxtFld().getText().length()!=0){
            JDialog errorMsgDialog=new  JDialog();
            errorMsgDialog.setTitle("Error in text ");
            errorMsgDialog.setSize(500,500);
            errorMsgDialog.setVisible(true);
            Container container = new Container();
            container.setLayout(null);
            JLabel errorLbl = new JLabel("You have entered an a letter in the alphabet or a character. Please use only numbers.");
            container.add(errorLbl);
            container.setVisible(true);
            errorMsgDialog.setContentPane(container);

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
