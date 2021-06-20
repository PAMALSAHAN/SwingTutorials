package gui;
import data.PatientData;
import data.PatientTableModel;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.awt.*;
public class PatientListView extends JPanel {
    private PatientTableModel patientTableModel;
    private JTable patientTable;
    private JScrollPane jScrollPane;

    public PatientListView(PatientTableModel patientTableModel) {
        this.patientTableModel = patientTableModel;
    }

    public PatientListView() {
        initUI();
    }

    private void initUI() {
        patientTableModel = new PatientTableModel();
        patientTableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                System.out.println("fujssssssss");
            }
        });
        this.setLayout(new GridBagLayout());
        this.add(getScrollPane(), new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(45, 0, 0, 0), 0, 0));
        this.setVisible(true);
    }

    public void addPatientDataToModel(PatientData patientData) {
        patientTableModel.setPatientData(patientData);
    }

    private JTable getPatientDataTable() {
        if (patientTable == null) {
            patientTable = new JTable();
            patientTable.setModel(patientTableModel);
            patientTable.setVisible(true);
        }
        return patientTable;
    }

    private JScrollPane getScrollPane() {
        if (jScrollPane == null) {
            jScrollPane = new JScrollPane(getPatientDataTable());
        }
        return jScrollPane;
    }

}