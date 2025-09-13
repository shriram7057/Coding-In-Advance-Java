import java.awt.*;
import javax.swing.*;
class JframeExample2 extends JFrameDemo
{
    JframeExample2()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        setTitle("Introducton to JFrame");
        java.awt.Container c=getContentPane();
        c.setBackground(Color.CYAN);

        ImageIcon icon=new ImageIcon("Ai.jpg");
        Image image=icon.getImage();
        setIconImage(image);
        setIconImage(icon.getImage());
        setResizable(true);
    }
    public static void main(String[] args) {
        JframeExample2 j=new JframeExample2();

    }
}