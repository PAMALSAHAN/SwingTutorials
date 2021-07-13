package gui;

import data.PatientData;
import data.PatientTableModel;
import javax.swing.*;
import java.awt.*;

public class PatientListViewPanel extends JPanel {

    private PatientTableModel patientTableModel;
    private JTable patientTable;
    private JScrollPane jScrollPane;

    public PatientListViewPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Color.blue);
        this.getPatientTableModel();
        this.setLayout(new GridBagLayout());
        addComponentToPanel();
    }

    private void addComponentToPanel() {
        addTable();
    }

    private void addTable() {
        this.add(getScrollPane(), new GridBagConstraints(0, 0, 0, 0,
                1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 5, 5));
    }

    public void addPatientDataToModel(PatientData patientData) {
        patientTableModel.setPatientData(patientData);
    }

    public JTable getPatientDataTable() {
        if (patientTable == null) {
            patientTable = new JTable();
            patientTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            patientTable.setModel(patientTableModel);
        }
        return patientTable;
    }

    private JScrollPane getScrollPane() {
        if (jScrollPane == null) {
            jScrollPane = new JScrollPane(getPatientDataTable());
            jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        }
        return jScrollPane;
    }

    public PatientTableModel getPatientTableModel() {
        if (patientTableModel == null) {
            patientTableModel = new PatientTableModel();
        }
        return patientTableModel;
    }
}