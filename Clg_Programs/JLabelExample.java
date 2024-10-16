import java.awt.*;
import javax.swing.*;

class JLabelExample extends JFrame {
    JLabelExample() 
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);

        java.awt.Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        JLabel l1 = new JLabel("Username");
        // l1.setText("UserId");
        l1.setBounds(100, 50, 200, 30);
        Font f = new Font("Arial", Font.BOLD, 30);
        l1.setFont(f);

        add(l1);
        l1.setBackground(Color.RED);
        l1.setForeground(Color.BLACK);
        c.add(l1);
    }

    public static void main(String[] args) {
        JLabelExample j = new JLabelExample();
    }
}