package assignment.data;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

// extend ekaranawa abstract table model eka
// data ganna table model ekata method ekak danawa array list ekak ekka
// e method ekata aniwa danna one code ekak tinawa table eka trigger karanna
public class PatientDataModel extends AbstractTableModel {
    private List<PatientData> patientDataList=new ArrayList<>(0);
    public int getRowCount() {
        return patientDataList.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return patientDataList.get(rowIndex).getName();
            case 1:
                return patientDataList.get(rowIndex).getAge();
        }
        return null;
    }

    //patient data model ekata ganna method eka
    public void setPatientData(PatientData patientData){
        this.patientDataList.add(patientData);
        fireTableRowsInserted(patientDataList.size() - 1, patientDataList.size() - 1);
    }

    //table eke nam tika ganna
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Name";
            case 1:
                return "Age";
            default:
                throw new IndexOutOfBoundsException();
        }
    }
}
