package gui;

import helper.ComboBoxItem;
import net.sourceforge.jdatepicker.JDatePicker;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;


public class InputPanel extends JPanel {

    /**
     * LABELS
     */
    private JLabel nameLbl;
    private JLabel phoneLbl;
    private JLabel bDayLbl;
    private JLabel genderLbl;
    private JLabel addressLbl;
    private JLabel empStatusLbl;


    private JTextField nameTxtFld;
    private JTextField phoneTxtFld;
    private JDatePicker bDayChooser;
    private JTextArea addressTxt;
    private JComboBox empStatus;


    public InputPanel() {
        initJPanel();
    }

    private void initJPanel() {
//        this.setSize(100,100);
        this.setLayout(new GridBagLayout());
        this.add(getNameLbl(), new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        this.add(getNameTxtFld(), new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));

        this.add(getPhoneLbl(), new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        this.add(getPhoneTxtFld(), new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));

        this.add(getAddressLbl(), new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        this.add(getAddressTxtArea(), new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));

        this.add(getEmpStatusLbl(), new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        this.add(getEmpStatusDropDown(), new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));

    }


    public JLabel getNameLbl() {
        if (nameLbl == null) {
            nameLbl = new JLabel("Name * :");
        }
        return nameLbl;
    }

    public JLabel getPhoneLbl() {
        if(phoneLbl==null){
            phoneLbl=new JLabel("Phone Number :");
        }
        return phoneLbl;
    }

    public JLabel getGenderLbl() {
        if (genderLbl==null){
            genderLbl=new JLabel("Gender * :");
        }
        return genderLbl;
    }

    public JLabel getAddressLbl() {
        if (addressLbl==null){
            addressLbl=new JLabel("Address :");
        }

        return addressLbl;
    }

    public JLabel getEmpStatusLbl() {
        if (empStatusLbl==null){
            empStatusLbl=new JLabel("Employment Status :");
        }
        return empStatusLbl;
    }

    public JTextField getNameTxtFld() {
        if(nameTxtFld==null){
            nameTxtFld=new JTextField();
        }
        return nameTxtFld;
    }

    public void setNameTxtFld(String text) {
        this.nameTxtFld.setText(text);
    }

    public JTextField getPhoneTxtFld() {
        if(phoneTxtFld==null){
            phoneTxtFld=new JTextField();

        }
        return phoneTxtFld;
    }

    public void setPhoneTxtFld(String text) {
        this.phoneTxtFld.setText(text);
    }

    public JTextArea getAddressTxtArea() {
        if(addressTxt==null){
            addressTxt=new JTextArea();
        }
        return addressTxt;
    }

    public void setAddressTxt(String text) {
        this.addressTxt.setText(text);
    }

    public JComboBox getEmpStatusDropDown() {
        if(empStatus==null){
            empStatus=new JComboBox();
            empStatus.addItem(new ComboBoxItem(1, "Part Time"));
            empStatus.addItem(new ComboBoxItem(2, "Retired"));
            empStatus.addItem(new ComboBoxItem(3, "Student"));
            empStatus.addItem(new ComboBoxItem(4, "Unemployed"));
        }
        return empStatus;
    }

    public void setEmpStatus(JComboBox empStatus) {
        this.empStatus = empStatus;
    }

}
