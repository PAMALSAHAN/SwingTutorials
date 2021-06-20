package data;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class PatientTableModel implements TableModel {
    private List<PatientData> patientDataList = new ArrayList<>(0);

    @Override
    public int getRowCount() {
        return patientDataList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
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
    public Class<?> getColumnClass(int columnIndex) {
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PatientData currentObject = patientDataList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return currentObject.getName();
            case 1:
                return currentObject.getPhoneNumber();

            case 2:
                return currentObject.getAddress();
            case 3:
                return currentObject.getEmpType();
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {


    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void setPatientData(PatientData patientData) {
        this.patientDataList.add(patientData) ;

        //fireTableDataChanged();

    }


}
