package form;

import javax.swing.*;

public class Form extends JFrame {
    JLabel lblName,lblPhoneNumber,lblBirthday,lblGender,lblAddress,lblEmploymentStatus;
    JTextField txtName,txtPhoneNumber;

    public Form(){
        initForm();
    }

    private void initForm() {
        this.setSize(500,700);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
