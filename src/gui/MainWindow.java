package gui;

import helper.UIMediator;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel searchCriteriaPanel;
    private JPanel patientListView;

    private UIMediator mediator;

    public MainWindow() {
        //mekedi object eke hadala nemene eka hinda use karanne
        // this keyword eka mokada jframe eka extend karala tina hinda
        initFrame();


    }

    private void initFrame() {
        this.setSize(500, 500);
        this.setLocation(200,0);
        this.setTitle("Patient Registration");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(100, 120, 100));

        this.mediator=new UIMediator(getInputPanel(),getButtonPanel(), getPatientListView());


        this.setLayout(new GridBagLayout());
        this.add(getInputPanel(), new GridBagConstraints(0, 0, 0, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
       this.add(getButtonPanel(), new GridBagConstraints(0, 1, 1, 0, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(5, 0, 0, 0), 0, 0));
        this.add(getPatientListView(), new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(45, 0, 5, 0), 0, 0));
        this.setVisible(true);
    }


    public JPanel getInputPanel() {
        if (inputPanel == null) {
            inputPanel = new InputPanel();
        }
        return inputPanel;
    }


    public JPanel getButtonPanel() {
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


    public JPanel getPatientListView() {
        if (patientListView==null){
            patientListView=new PatientListView();
        }
        return patientListView;
    }
}

