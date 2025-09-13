import java.awt.*;
import javax.swing.*;
class JTextAreaDemo extends JFrameDemo
{
    JTextAreaDemo()
    {
        //setBackground(Color.CYAN);
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        JTextArea jt=new JTextArea(10,20);
        add(jt);
    }
    public static void main(String args[])
    {
        JTextAreaDemo j=new JTextAreaDemo();
        j.setVisible(true);
        j.setTitle("JTextAreaFrame");
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
    }
}