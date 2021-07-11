package gridBagLayout.fillAndAnchor;

import javax.swing.*;
import java.awt.*;

public class FillAndAnchor extends JFrame {
    public FillAndAnchor()  {
        setTitle("GridBagLayout");
        GridBagLayout lay = new GridBagLayout();
        GridBagConstraints cons = new GridBagConstraints();
        setLayout(lay);
        setweightxAndweighty(cons,1,1);

        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.CENTER;
        setButton("button1",0,0,cons,lay);

        cons.fill = GridBagConstraints.VERTICAL;
        cons.anchor = GridBagConstraints.SOUTHWEST;
        setButton("button2",0,1,cons,lay);

        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.FIRST_LINE_START;
        setButton("button3",0,2,cons,lay);

        cons.fill = GridBagConstraints.VERTICAL;
        cons.anchor = GridBagConstraints.NORTHEAST;
        setButton("button4",1,0,cons,lay);

//        setweightxAndweighty(cons,0,0);
        setGridWithandGridHeight(cons,1,2);
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.WEST;
        setButton("button5",1,1,cons,lay);


//        setweightxAndweighty(cons,2,3);
//        setGridWithandGridHeight(cons,3,2);
        cons.fill = GridBagConstraints.NONE;
        cons.anchor = GridBagConstraints.EAST;
        setButton("button6",1,2,cons,lay);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,200);
        setVisible(true);
    }

    private void setGridWithandGridHeight(GridBagConstraints gbc, int gridWidth, int gridHeight) {
        gbc.gridwidth=gridWidth;
        gbc.gridheight=gridHeight;

    }

    void setButton(String name,int y,int x,GridBagConstraints gbc,GridBagLayout lay)
    {
        JButton jb = new JButton(name);
        gbc.gridy = y;
        gbc.gridx = x;
        lay.setConstraints(jb, gbc);
        add(jb);
    }

    void setweightxAndweighty(GridBagConstraints gbc,int weighty,int weightx)
    {
        gbc.weighty = weighty;
        gbc.weightx = weightx;
    }
}
