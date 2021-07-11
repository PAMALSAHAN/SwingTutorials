package gridBagLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindow extends Frame implements WindowListener {
    public FrameWindow(String frameTitle)  {
        super(frameTitle);
        this.setSize(300,150);
        this.setLocation(200,0);
        addWindowListener(this);

        JButton buttonOne=new JButton("b1");
        JButton buttonTwo=new JButton("b2");
        JButton buttonThree=new JButton("b3");
        JButton buttonFour=new JButton("b4");
        JButton buttonFive=new JButton("b5");

        GridBagLayout gridBagLayout=new GridBagLayout();

        this.setLayout(gridBagLayout);

        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.fill=GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx=1;

        gridBagLayout.setConstraints(buttonOne,gridBagConstraints);
        this.add(buttonOne);

        gridBagConstraints.weightx=2;

        gridBagLayout.setConstraints(buttonTwo,gridBagConstraints);
        this.add(buttonTwo);

        gridBagConstraints.weightx=1;
        gridBagLayout.setConstraints(buttonThree,gridBagConstraints);
        this.add(buttonThree);

        gridBagLayout.setConstraints(buttonFour,gridBagConstraints);
        this.add(buttonFour);

        gridBagLayout.setConstraints(buttonFive,gridBagConstraints);
        this.add(buttonFive);


    }

    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        this.dispose();
    }

    public void windowClosed(WindowEvent e) {
        this.dispose();
    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }
}
