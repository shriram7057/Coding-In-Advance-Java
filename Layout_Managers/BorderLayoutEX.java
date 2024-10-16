// package LayoutManagers;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutEX extends JFrame 
{
    BorderLayoutEX()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,300);
        java.awt.Container c=getContentPane();

        BorderLayout borderLayout=new BorderLayout();
        c.setLayout(borderLayout);
        JButton b1=new JButton("PAGE_START");
        JButton b2=new JButton("PAGE_END");
        JButton b3=new JButton("LINE_START");
        JButton b4=new JButton("CENTER");
        JButton b5=new JButton("LINE_END");

//        c.add(b1,BorderLayout.PAGE_START);
//        c.add(b2,BorderLayout.PAGE_END);
//        c.add(b3,BorderLayout.LINE_START);
//        c.add(b4,BorderLayout.CENTER);
//        c.add(b5,BorderLayout.LINE_END);

         c.add(b1,BorderLayout.NORTH);
         c.add(b2,BorderLayout.SOUTH);
         c.add(b3,BorderLayout.WEST);
         c.add(b4,BorderLayout.CENTER);
         c.add(b5,BorderLayout.EAST);

        borderLayout.setHgap(10);//Horizontal Gap
        borderLayout.setVgap(5);//Vertical Gap
    }

    public static void main(String[] args) 
    {
         new BorderLayoutEX();
    }
}
