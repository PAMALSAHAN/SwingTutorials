package data;


import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PatientTableModel extends AbstractTableModel {
    private List<PatientData> patientDataList = new ArrayList<>(0);

    @Override
    public int getRowCount() {
        return patientDataList.size();
    }

    @Override
    public int getColumnCount() {
        return PatientData.class.getDeclaredFields().length;
        // meken patient data ekata adala attributes tika gannawa ekiyanne
        //private fields tika eke use karana hama attribute ekakma ganna one
        //un used attribute tibboth error ekak denawa
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Name";
            case 1:
                return "Phone Number";

            case 2:
                return "Address";
            case 3:
                return "Employment Type";
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return patientDataList.get(rowIndex).getName();
            case 1:
                return patientDataList.get(rowIndex).getPhoneNumber();

            case 2:
                return patientDataList.get(rowIndex).getAddress();
            case 3:
                return patientDataList.get(rowIndex).getEmpType();

        }
        return null;
    }

    public void setPatientData(PatientData patientData) {
        this.patientDataList.add(patientData) ;
        fireTableRowsInserted(patientDataList.size() - 1, patientDataList.size() - 1);
    }


}
