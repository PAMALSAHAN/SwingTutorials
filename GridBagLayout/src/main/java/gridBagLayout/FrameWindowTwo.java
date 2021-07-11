package gridBagLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindowTwo extends Frame implements WindowListener {
    public FrameWindowTwo(String frameTitle)  {
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

        //meke weightx eken karanne grid eka gana eken  x axis eka fill karana eka thama karanne
        // meka horizontal nathiwa vertical karala weigtx eka weighty karanam vertically thama
        // fil wenne.

        // meke fill method ekea both nam weightx and weigthy dekama denna one api denawa 1 kiyala
        // ethakota frame eka pirenna fill wela tiyenawa.
        gridBagConstraints.fill=GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx=1;
        gridBagLayout.setConstraints(buttonOne,gridBagConstraints);


        gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(buttonTwo,gridBagConstraints);


        // mekedi wenne fill wela tinne horizontal ne e theruwa b1 and b2 ekama row
        // eke set wenawa.

        gridBagConstraints.gridwidth=1;
        // methanin aye parak reset karanawa gird with eka mokada aluth line
        // ekakata thama watenne
        gridBagLayout.setConstraints(buttonThree,gridBagConstraints);


        gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(buttonFour,gridBagConstraints);

        gridBagLayout.setConstraints(buttonFive,gridBagConstraints);


        this.add(buttonOne);
        this.add(buttonTwo);
        this.add(buttonThree);
        this.add(buttonFour);
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
