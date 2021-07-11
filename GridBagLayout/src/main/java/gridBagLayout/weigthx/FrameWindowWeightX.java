package gridBagLayout.weigthx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindowWeightX extends Frame implements WindowListener {
    public FrameWindowWeightX(String frameTitle)  {
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
//        gridBagConstraints.weightx=2;
        gridBagConstraints.fill=GridBagConstraints.HORIZONTAL;
//        gridBagConstraints.weightx=1;
        gridBagConstraints.gridwidth=1;

        gridBagLayout.setConstraints(buttonOne,gridBagConstraints);
        this.add(buttonOne);

//        gridBagConstraints.weightx=4;
        gridBagConstraints.gridwidth=4;
        gridBagLayout.setConstraints(buttonTwo,gridBagConstraints);
        this.add(buttonTwo);

        gridBagConstraints.gridwidth=1;
        gridBagConstraints.weightx=1;
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=1;
        gridBagLayout.setConstraints(buttonThree,gridBagConstraints);
        this.add(buttonThree);

        gridBagConstraints.gridx=1;
        gridBagConstraints.gridy=1;
        gridBagLayout.setConstraints(buttonFour,gridBagConstraints);
        this.add(buttonFour);

        gridBagConstraints.gridx=3;
        gridBagConstraints.gridy=1;
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
