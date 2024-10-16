import java.awt.*;
import javax.swing.*;
class JButtonDemo extends Frame
{
    JButtonDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        JButton b1=new JButton("Submit");
        add(b1);
        b1.setForeground(Color.RED);
    }
    public static void main(String[] args) {
        JButtonDemo b=new JButtonDemo();
        b.setTitle("ButtonFrame");
        b.setVisible(true);
        b.setSize(500,500);
    }
}