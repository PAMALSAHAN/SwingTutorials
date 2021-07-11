package assignment.gui;

import assignment.data.PatientData;
import assignment.data.PatientDataModel;

import javax.swing.*;
import java.awt.*;
//Jtable eka
//JScroll pane eka
// patient data model eka ui initiate karanawa ekkama initiate kara
// patient data model ekata data set karanna method ekak liyanna one

public class TablePanel extends JPanel {
    private JTable patientTable;
    private JScrollPane JScrollPane;
    private PatientDataModel patientDataModel;
    public TablePanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Color.green);
        this.patientDataModel=new PatientDataModel();
        this.setLayout(new GridBagLayout());
        this.add(getJScrollPane(),new GridBagConstraints(0, 0, 0, 0,
                1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 5, 5));
    }

    public JTable getPatientTable() {
        if (patientTable == null) {
            patientTable=new JTable();
            patientTable.setModel(patientDataModel);
        }
        return patientTable;
    }

    public javax.swing.JScrollPane getJScrollPane() {
        if (JScrollPane == null) {
            JScrollPane=new JScrollPane(getPatientTable());
        }
        return JScrollPane;
    }

    // patient data table eka haraha model ekata set karanna one
    public void addDataToTheModel(PatientData patientData){
        this.patientDataModel.setPatientData(patientData);
    }
}
