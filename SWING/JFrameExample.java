import javax.swing.*;
import java.awt.*;

public class JFrameExample extends JFrame 
{
    JFrameExample() 
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(600,500);
        // setLocation(100,100);
        setBounds(100, 100, 600, 500);
        setTitle("Introduction to JFrame");

        java.awt.Container c = getContentPane();
        c.setBackground(Color.pink);

        setResizable(false);

    }

    public static void main(String[] args) {
        JFrameExample j = new JFrameExample();
    }
}