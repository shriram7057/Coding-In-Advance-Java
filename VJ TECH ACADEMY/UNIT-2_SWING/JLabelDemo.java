import java.awt.*;
import javax.swing.*;
class JLabelDemo extends JFrame
{
    JLabelDemo()
    {
       java.awt.Container c= getContentPane();
        FlowLayout f1=new FlowLayout();
        c.setLayout(f1);
      //  c.setForeground(Color.CYAN);
        ImageIcon i=new ImageIcon("Programmer.png");
        JLabel l1=new JLabel(i);
        c.add(l1);
    }
    public static void main(String args[])
    {
        JLabelDemo j=new JLabelDemo();
        j.setTitle("JLabel");
        j.setSize(500,500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}