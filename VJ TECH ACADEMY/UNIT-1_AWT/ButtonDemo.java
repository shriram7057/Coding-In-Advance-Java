import java.awt.*;
import javax.swing.*;
class ButtonDemo extends JFrameDemo
{
    ButtonDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        JButton b1=new JButton("Submit");
        add(b1);
        setBackground(Color.CYAN);
        b1.setForeground(Color.BLACK);
    }
    public static void main(String[] args) {
        ButtonDemo b=new ButtonDemo();
        b.setVisible(true);
        b.setTitle("Button");
        b.setSize(300,300);
    }
}