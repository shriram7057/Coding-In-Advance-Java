import java.awt.*;
import javax.swing.*;
class JComboBoxDemo extends JFrameDemo
{
    JComboBoxDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        java.awt.Container c= getContentPane();
        JComboBox jb=new JComboBox();
        jb.addItem("C Language");
        jb.addItem("C++ Language");
        jb.addItem("Java Language");
        jb.addItem("Python Language");
        jb.addItem("PHP Language");
        c.add(jb);
    }
    public static void main(String args[])
    {
        JComboBoxDemo j=new JComboBoxDemo();
        j.setTitle("JComboBox");
        j.setVisible(true);
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
    }
}