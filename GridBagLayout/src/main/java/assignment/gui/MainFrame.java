package assignment.gui;

import assignment.helper.UIMediator;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private InputPanel inputPanel;
    private ButtonPanel buttonPanel;
    private TablePanel tablePanel;
    private UIMediator uiMediator;
    public MainFrame()  {
        initFrame();
        this.uiMediator=new UIMediator(getInputPanel(),getButtonPanel(),getTablePanel());
        this.setLayout(new GridBagLayout());
        initPanel();
    }

    private void initPanel() {
        addInputPanel();
        addButtonPanel();
        addTablePanel();
    }

    private void addTablePanel() {
        this.add(getTablePanel(),
                new GridBagConstraints(0, 2, 1, 1, 1.0, 0.1,
                        GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addButtonPanel() {
        this.add(getButtonPanel(),
                new GridBagConstraints(0, 1, 1, 1,
                        1.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addInputPanel() {
        this.add(getInputPanel(),
                new GridBagConstraints(0, 0, 1, 1,
                        1.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    private void initFrame() {
        this.setSize(800, 700);
        this.setLocation(300,0);
        this.setTitle("Patient Registration");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(100, 120, 100));
    }

    public InputPanel getInputPanel() {
        if (inputPanel == null) {
            inputPanel= new InputPanel();
        }
        return inputPanel;
    }

    public ButtonPanel getButtonPanel() {
        if (buttonPanel == null) {
            buttonPanel= new ButtonPanel();
        }
        return buttonPanel;
    }

    public TablePanel getTablePanel() {
        if (tablePanel == null) {
            tablePanel=new TablePanel();
        }
        return tablePanel;
    }
}
