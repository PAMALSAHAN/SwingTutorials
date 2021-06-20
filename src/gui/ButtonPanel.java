package gui;


import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JButton closeBtn;
    private JButton saveBtn;

    public ButtonPanel() {
        initUI();
    }

    private void initUI() {

      //  this.setLayout(new GridBagLayout());
        this.add(getCloseBtn(), new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.NORTHEAST, new Insets(0, 0, 0, 5), 0, 0));
        this.add(getSaveBtn(), new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.NORTHEAST, new Insets(0, 0, 0, 5), 0, 0));


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
