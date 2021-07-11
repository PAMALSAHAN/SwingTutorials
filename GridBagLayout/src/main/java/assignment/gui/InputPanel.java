package assignment.gui;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private JLabel nameLbl;
    private JTextField nameTxt;
    private JLabel ageLbl;
    private JTextField ageTxt;
    public InputPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Color.green);
        this.setLayout(new GridBagLayout());
        addNameLbl();
        addNameTxt();
        addAgeLbl();
        addAgeTxt();
    }

    private void addAgeTxt() {
        this.add(getAgeTxt(),
                new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addAgeLbl() {
        this.add(getAgeLbl(),
                new GridBagConstraints(0, 1, 1, 1, 0.1, 1.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addNameTxt() {
        this.add(getNameTxt(),
                new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addNameLbl() {
        this.add(getNameLbl(),
                new GridBagConstraints(0, 0, 1, 1, 0.1, 1.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    public JLabel getNameLbl() {
        if (nameLbl == null) {
            nameLbl= new JLabel("Name:");
        }
        return nameLbl;
    }

    public JTextField getNameTxt() {
        if (nameTxt == null) {
            nameTxt= new JTextField();
        }
        return nameTxt;
    }

    public JLabel getAgeLbl() {
        if (ageLbl == null) {
            ageLbl= new JLabel("Age:");
        }
        return ageLbl;
    }

    public JTextField getAgeTxt() {
        if (ageTxt == null) {
            ageTxt= new JTextField();
        }
        return ageTxt;
    }
}
