package gridBagLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ExampleTwo extends  Frame  {
    public ExampleTwo(String text)  {
        this.setSize(300,150);
        this.setLocation(200,0);
        this.setTitle(text);

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

        gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(buttonTwo,gridBagConstraints);
        this.add(buttonTwo);

        // mekedi wenne fill wela tinne horizontal ne e theruwa b1 and b2 ekama row
        // eke set wenawa.

        gridBagConstraints.gridwidth=1;
        // methanin aye parak reset karanawa gird with eka mokada aluth line
        // ekakata thama watenne
        gridBagLayout.setConstraints(buttonThree,gridBagConstraints);
        this.add(buttonThree);

        gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(buttonFour,gridBagConstraints);
        this.add(buttonFour);

        gridBagLayout.setConstraints(buttonFive,gridBagConstraints);
        this.add(buttonFive);



    }


}
