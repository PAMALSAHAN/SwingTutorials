package gui;


import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JButton closeBtn;
    private JButton saveBtn;

    public ButtonPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Color.blue);
        this.setLayout(new GridBagLayout());
        addComponentToPanel();
    }

    private void addComponentToPanel() {
        addCloseButton();
        addSaveButton();
    }

    private void addSaveButton() {
        this.add(getSaveBtn(), new GridBagConstraints(1, 0, 0, 1,
                0.5, 1.0, GridBagConstraints.LINE_START, GridBagConstraints.CENTER,
                new Insets(5, 5, 5, 5), 5, 5));
    }

    private void addCloseButton() {
        this.add(getCloseBtn(), new GridBagConstraints(0, 0, 1, 1,
                0.5, 1.0, GridBagConstraints.LINE_END, GridBagConstraints.CENTER,
                new Insets(5, 5, 5, 5), 5, 5));
    }


    public JButton getCloseBtn() {
        if(closeBtn==null){
            closeBtn=new JButton("Close");

        }
        return closeBtn;
    }

    public JButton getSaveBtn() {
        if(saveBtn==null){
            saveBtn=new JButton("Save");
            saveBtn.setEnabled(false);

        }
        return saveBtn;
    }
}
