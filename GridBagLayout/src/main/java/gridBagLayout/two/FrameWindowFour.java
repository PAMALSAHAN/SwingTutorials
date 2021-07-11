package gridBagLayout.two;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindowFour extends Frame implements WindowListener {
    public FrameWindowFour(String frameTitle)  {
        super(frameTitle);
        this.setSize(500,250);
        this.setResizable(false);
        this.setLocation(200,0);
        addWindowListener(this);

        JButton buttonOne=new JButton("b1");
        JButton buttonTwo=new JButton("b2");
        JButton buttonThree=new JButton("b3");
        JButton buttonFour=new JButton("b4");
        JButton buttonFive=new JButton("b5");
        JButton buttonSix=new JButton("b6");
        JButton buttonSeven=new JButton("b7");
        JButton buttonEight=new JButton("b8");
        JButton buttonNine=new JButton("b9");

        GridBagLayout gridBagLayout=new GridBagLayout();

        this.setLayout(gridBagLayout);

        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.weighty=1;
        gridBagConstraints.weightx=1;
        gridBagConstraints.fill=GridBagConstraints.BOTH;

        //add button one
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        gridBagConstraints.gridwidth=2;
        gridBagConstraints.gridheight=1;

        gridBagLayout.setConstraints(buttonOne,gridBagConstraints);
        this.add(buttonOne);
        gridBagConstraints.gridx=2;
        gridBagLayout.setConstraints(buttonTwo,gridBagConstraints);
        this.add(buttonTwo);

        gridBagConstraints.gridwidth=1;

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=1;
        gridBagConstraints.weightx=1;
        gridBagLayout.setConstraints(buttonThree,gridBagConstraints);
        gridBagConstraints.gridx=1;
        this.add(buttonThree);
        gridBagLayout.setConstraints(buttonFour,gridBagConstraints);
        gridBagConstraints.gridx=2;
        this.add(buttonFour);
        gridBagLayout.setConstraints(buttonFive,gridBagConstraints);
        gridBagConstraints.gridx=3;
        this.add(buttonFive);
        gridBagLayout.setConstraints(buttonSix,gridBagConstraints);
        this.add(buttonSix);

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=3;
        gridBagLayout.setConstraints(buttonSeven,gridBagConstraints);
        this.add(buttonSeven);

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=3;
        gridBagConstraints.gridwidth=3;
        gridBagLayout.setConstraints(buttonEight,gridBagConstraints);
        this.add(buttonEight);

        gridBagConstraints.gridwidth=1;
        gridBagConstraints.gridheight=2;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridx=3;
        gridBagLayout.setConstraints(buttonNine,gridBagConstraints);
        this.add(buttonNine);



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
