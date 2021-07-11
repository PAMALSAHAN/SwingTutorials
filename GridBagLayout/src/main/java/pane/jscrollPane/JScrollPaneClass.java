package pane.jscrollPane;

import javax.swing.*;
import java.awt.*;


// this is use to get scrollable view of the component when screen size is limited
public class JScrollPaneClass extends JFrame {
    public JScrollPaneClass(String title) throws HeadlessException {
        super(title);
        this.setTitle(title);
        this.setLocation(300,0);
        this.setSize(500,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JTextArea jTextArea=new JTextArea(10,10);
        JScrollPane jScrollPane=new JScrollPane(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(jScrollPane);
       //set visible eka liyanna one
    }
}

class Test{
    public static void main(String[] args) {
        JScrollPaneClass jScrollPaneClass=new JScrollPaneClass("scrol pane");
        jScrollPaneClass.setVisible(true);
    }
}
