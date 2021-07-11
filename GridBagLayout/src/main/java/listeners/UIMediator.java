package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIMediator implements ActionListener {
    private ButtonPanel buttonPanel;

    public UIMediator(ButtonPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
        buttonPanel.getSaveBtn().addActionListener(this::saveButton);  //method reference
        addButtonListeners();

        //action listeners waladi api button ekata action set karanna one
        //but document listner ekata apita register karanna one naha.

    }

    private void addButtonListeners() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click action performed");
    }

    public void saveButton(ActionEvent e) {
        System.out.println("click save button");
    }
}
