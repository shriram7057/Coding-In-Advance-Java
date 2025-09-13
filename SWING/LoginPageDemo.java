import java.awt.*;
import javax.swing.*;

class LoginDemoPage extends JFrameDemo {
    LoginDemoPage() {
        java.awt.Container c = getContentPane();
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        
        // Username label and text field
        JLabel l1 = new JLabel("Username");
        l1.setBounds(50, 100, 80, 30);
        c.add(l1);
        
        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 100, 150, 30);
        c.add(tf1);
        
        // Password label and password field
        JLabel l2 = new JLabel("Password");
        l2.setBounds(50, 150, 80, 30);
        c.add(l2);
        
        JPasswordField pf1 = new JPasswordField();
        pf1.setBounds(150, 150, 150, 30);
        c.add(pf1);
        
        
        JButton b1 = new JButton("Submit");
        b1.setBounds(150, 200, 150, 30);  
        c.add(b1);
        
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginDemoPage();
    }
}
