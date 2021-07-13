package listner;

import gui.ButtonPanel;
import gui.InputPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class TableDocumentListeners implements DocumentListener {

    private InputPanel inputPanel;
    private ButtonPanel btnPanel;

    public TableDocumentListeners(InputPanel inputPanel, ButtonPanel btnPanel) {

        this.inputPanel = inputPanel;
        this.btnPanel = btnPanel;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            docChanged();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try {
            docChanged();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }

    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        try {
            docChanged();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }

    }

    public void registerDocListeners() {
        inputPanel.getNameTxtFld().getDocument().addDocumentListener(this);
        inputPanel.getPhoneTxtFld().getDocument().addDocumentListener(this);
        inputPanel.getAddressTxtArea().getDocument().addDocumentListener(this);
    }

    public void docChanged() throws BadLocationException {


        if (inputPanel.getNameTxtFld().getDocument().getLength() > 0) {
            btnPanel.getSaveBtn().setEnabled(true);
        }

        String regex = "[0-9]+";
        Document phoneDoc = inputPanel.getPhoneTxtFld().getDocument();
        if (!phoneDoc.getText(0, phoneDoc.getLength()).matches(regex) && inputPanel.getPhoneTxtFld().getText().length() != 0) {
            JOptionPane.showMessageDialog(this.inputPanel, "Please use only numbers");
        }
    }
}
