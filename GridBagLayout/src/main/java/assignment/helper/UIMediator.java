package assignment.helper;

import assignment.data.PatientData;
import assignment.gui.ButtonPanel;
import assignment.gui.InputPanel;
import assignment.gui.TablePanel;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIMediator implements DocumentListener {

    private InputPanel inputPanel;
    private ButtonPanel buttonPanel;
    private TablePanel tablePanel;
    private PatientData patientData;

    public UIMediator(InputPanel inputPanel, ButtonPanel buttonPanel, TablePanel tablePanel) {
        this.inputPanel = inputPanel;
        this.buttonPanel = buttonPanel;
        this.tablePanel = tablePanel;
        registerDocumentListener();
        buttonPanel.getSaveBtn().addActionListener(this ::addingInputDataToTable);

    }

    private void addingInputDataToTable(ActionEvent actionEvent) {
        patientData=new PatientData();
        patientData.setName(inputPanel.getNameTxt().getText());
        patientData.setAge(Integer.parseInt(inputPanel.getAgeTxt().getText()));
        tablePanel.addDataToTheModel(patientData);
    }

    private void registerDocumentListener() {
//        inputPanel.getNameTxt().getDocument().addDocumentListener(this);
//        inputPanel.getAgeTxt().getDocument().addDocumentListener(this);
    }

    public void insertUpdate(DocumentEvent e) {

    }

    public void removeUpdate(DocumentEvent e) {

    }

    public void changedUpdate(DocumentEvent e) {

    }


}
