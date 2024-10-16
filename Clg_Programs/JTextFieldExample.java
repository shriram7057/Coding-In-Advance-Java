import java.awt.*;
import javax.swing.*;

class JTextFieldExample extends JFrame {
    JTextFieldExample() 
    {   
        FlowLayout f2=new FlowLayout();
        setLayout(f2);
        setBackground(Color.CYAN);
        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 100, 200, 20);
        tf1.setText("Enter UserName");
        add(tf1);
        Font f1 = new Font("Times new Roman", Font.BOLD, 25);
        tf1.setFont(f1);
        tf1.setBackground(Color.CYAN);
        tf1.setForeground(Color.BLUE);
        tf1.setEditable(false);
    }
    
    public static void main(String[] args) {
        JTextFieldExample t = new JTextFieldExample();
        t.setVisible(true);
        t.setSize(400, 400);
        t.setTitle("Text Filed");
    }
}