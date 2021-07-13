package helper;

import gui.ButtonPanel;
import gui.InputPanel;
import gui.PatientListViewPanel;
import listner.TableClickActionListeners;
import listner.TableMouseListeners;
import listner.TableDocumentListeners;


public class UIMediator {

    private InputPanel inputPanel;
    private ButtonPanel btnPanel;
    private PatientListViewPanel patientListViewPanel;
    private TableMouseListeners tableMouseListeners;
    private TableClickActionListeners tableClickActionListeners;
    private TableDocumentListeners tableDocumentListeners;

    public UIMediator(InputPanel inputPanel, ButtonPanel btnPanel, PatientListViewPanel patientListViewPanel) {
        this.inputPanel = inputPanel;
        this.btnPanel = btnPanel;
        this.patientListViewPanel = patientListViewPanel;
        addListenersToTable(btnPanel, patientListViewPanel);

    }

    private void addListenersToTable(ButtonPanel btnPanel, PatientListViewPanel patientListViewPanel) {
        getTableDocumentListeners().registerDocListeners();
        btnPanel.getSaveBtn().addActionListener(getClickActionListeners()::addingPatientDataToTable);
        patientListViewPanel.getPatientDataTable().addMouseListener(getMouseListeners());
    }

    public TableMouseListeners getMouseListeners() {
        if (tableMouseListeners == null) {
            tableMouseListeners = new TableMouseListeners(patientListViewPanel);
        }
        return tableMouseListeners;
    }

    public TableClickActionListeners getClickActionListeners() {
        if (tableClickActionListeners == null) {
            tableClickActionListeners = new TableClickActionListeners(inputPanel, patientListViewPanel);
        }
        return tableClickActionListeners;
    }

    public TableDocumentListeners getTableDocumentListeners() {
        if (tableDocumentListeners == null) {
            tableDocumentListeners = new TableDocumentListeners(inputPanel, btnPanel);
        }
        return tableDocumentListeners;
    }
}
