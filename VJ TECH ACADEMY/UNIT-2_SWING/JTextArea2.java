import javax.swing.*;
import java.awt.*;
class JTextArea2 extends JFrameDemo 
{
    JTextArea2() 
    {
        //Methods of the JFrame Class
        setVisible(true);
        setBounds(100, 100, 600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Methods For Container
        java.awt.Container c = getContentPane();//retrive the content pane of JFrame
        c.setLayout(null);
        c.setBackground(Color.CYAN);//set Background Color to the Container

        // Create JTextArea
        JTextArea jt1 = new JTextArea();
        jt1.setText("Hello Good Morning!");
        jt1.setBounds(100, 100, 400, 200);
        c.add(jt1);

        // Initialize Font before using it
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        jt1.setFont(f1);

        // Enable line wrapping
        jt1.setLineWrap(true);

        // Disable editing
        jt1.setEditable(false);
    }

    public static void main(String[] args) {
        new JTextArea2();
    }
}
