package listner;

import data.PatientData;
import gui.InputPanel;
import gui.PatientListViewPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableClickActionListeners implements ActionListener {
    private PatientListViewPanel patientListViewPanel;
    private PatientData patientData;
    private InputPanel inputPanel;

    public TableClickActionListeners(PatientListViewPanel patientListViewPanel) {
        this.patientListViewPanel = patientListViewPanel;
    }

    public TableClickActionListeners(InputPanel inputPanel, PatientListViewPanel patientListViewPanel) {

        this.inputPanel = inputPanel;
        this.patientListViewPanel = patientListViewPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void deleteEntireRow(ActionEvent actionEvent) {
        if (patientListViewPanel.getPatientDataTable().getSelectedRow() != -1) {
            System.out.println(patientListViewPanel.getPatientDataTable().getSelectedRow());
            patientListViewPanel.getPatientTableModel().removeRow(patientListViewPanel.getPatientDataTable().getSelectedRow());
            System.out.println(patientListViewPanel.getPatientDataTable().getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this.patientListViewPanel, "Please select a row");
        }
    }

    public void addingPatientDataToTable(ActionEvent actionEvent) {
        patientData = new PatientData();
        patientData.setName(inputPanel.getNameTxtFld().getText());
        patientData.setAddress(inputPanel.getAddressTxtArea().getText());
        patientData.setPhoneNumber(inputPanel.getPhoneTxtFld().getText());
        patientData.setEmpType(inputPanel.getEmpStatusDropDown().getSelectedItem().toString());
        patientListViewPanel.addPatientDataToModel(patientData);
    }
}
