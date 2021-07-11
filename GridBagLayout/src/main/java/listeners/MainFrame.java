package listeners;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ButtonPanel buttonPanel;
    private UIMediator uiMediator;
    public MainFrame() {
        initFrame();
        uiMediator=new UIMediator(getButtonPanel());
        this.setLayout(new GridBagLayout());
        initPanel();
    }

    private void initPanel() {
        addButtonPanel();
    }

    private void addButtonPanel() {
        this.add(getButtonPanel(),
                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
                        GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
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

    public ButtonPanel getButtonPanel() {
        if (buttonPanel == null) {
            buttonPanel=new ButtonPanel();
        }
        return buttonPanel;
    }
}
