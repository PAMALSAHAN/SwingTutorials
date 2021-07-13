package listner;

import gui.PatientListViewPanel;
import helper.TablePopupMenu;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableMouseListeners extends MouseAdapter {

    private PatientListViewPanel patientListViewPanel;
    private TablePopupMenu tablePopupMenu;
    private TableClickActionListeners tableClickActionListeners;

    public TableMouseListeners(PatientListViewPanel patientListViewPanel) {
        this.patientListViewPanel = patientListViewPanel;
    }

    public TableMouseListeners() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        if (SwingUtilities.isRightMouseButton(e)){
            System.out.println(patientListViewPanel.getPatientDataTable().getSelectedRow());
            getTablePopupMenu().getDelete().addActionListener(getClickActionListeners()::deleteEntireRow);
            patientListViewPanel.getPatientDataTable().setComponentPopupMenu(tablePopupMenu);
        }
        else {
            System.out.println("just click");
        }
    }

    public TablePopupMenu getTablePopupMenu() {
        if (tablePopupMenu == null) {
            tablePopupMenu=new TablePopupMenu();
        }
        return tablePopupMenu;
    }

    public TableClickActionListeners getClickActionListeners() {
        if (tableClickActionListeners == null) {
            tableClickActionListeners =new TableClickActionListeners(patientListViewPanel);
        }
        return tableClickActionListeners;
    }
}
