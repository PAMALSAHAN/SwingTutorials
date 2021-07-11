package listeners;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton saveBtn;
    public ButtonPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Color.green);
        this.setLayout(new GridBagLayout());
        this.add(getSaveBtn(),
                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
                        GridBagConstraints.EAST, GridBagConstraints.CENTER,
                        new Insets(5, 5, 5, 5), 5, 5));
    }

    public JButton getSaveBtn() {
        if (saveBtn == null) {
            saveBtn=new JButton("Save");
        }
        return saveBtn;
    }
}
