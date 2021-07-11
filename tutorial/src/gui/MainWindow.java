package gui;

import helper.UIMediator;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private InputPanel inputPanel;
    private ButtonPanel buttonPanel;
    private JPanel searchCriteriaPanel;
    private PatientListViewPanel patientListViewPanel;

    private UIMediator mediator;

    public MainWindow() {
        //mekedi object eke hadala nemene eka hinda use karanne
        // this keyword eka mokada jframe eka extend karala tina hinda
        initFrame();
        this.mediator=new UIMediator(getInputPanel(),getButtonPanel(), getPatientListView());
        this.setLayout(new GridBagLayout());
        initPanels();

    }

    private void initPanels() {
        addInputPanel();
        addButtonPanel();
        addPatientListViewPanel();
    }

    private void addPatientListViewPanel() {
        this.add(getPatientListView(), new GridBagConstraints(0, 2, 1, 0,
                1.0, 0.1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addButtonPanel() {
        this.add(getButtonPanel(), new GridBagConstraints(0, 1, 1, 1,
                1.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addInputPanel() {
        this.add(getInputPanel(), new GridBagConstraints(0, 0, 1, 1,
                1.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 5, 5));
    }

    private void initFrame() {
        this.setSize(800, 900);
        this.setLocation(300,0);
        this.setTitle("Patient Registration");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(100, 120, 100));

    }


    public InputPanel getInputPanel() {
        if (inputPanel == null) {
            inputPanel = new InputPanel();
        }
        return inputPanel;
    }


    public ButtonPanel getButtonPanel() {
        if (buttonPanel== null){
            buttonPanel=new ButtonPanel();
        }
        return buttonPanel;
    }

    public JPanel getSearchCriteriaPanel() {
        if (searchCriteriaPanel==null){
            searchCriteriaPanel=new SearchCriteriaPanel();
        }
        return searchCriteriaPanel;
    }


    public PatientListViewPanel getPatientListView() {
        if (patientListViewPanel ==null){
            patientListViewPanel =new PatientListViewPanel();
        }
        return patientListViewPanel;
    }
}

