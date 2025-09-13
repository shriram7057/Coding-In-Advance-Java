import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class SwingEle extends JFrameDemo implements ActionListener {
    java.awt.Container c = getContentPane();
    JButton j1, j2, j3;

    SwingEle() {
        setVisible(true);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        c.setLayout(null); // Add this to handle absolute positioning

        j1 = new JButton("Click Here");
        j1.setBounds(100, 100, 100, 30);
        j2 = new JButton("Click Here");
        j2.setBounds(200, 100, 120, 30);
        j3 = new JButton("Click Here");
        j3.setBounds(300, 100, 140, 30);

        // Add action listeners
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);

        c.add(j1);
        c.add(j2);
        c.add(j3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == j1) {
            c.setBackground(Color.CYAN);
        }
        if (e.getSource() == j2) {
            c.setBackground(Color.ORANGE);
        }
        if (e.getSource() == j3) {
            c.setBackground(Color.DARK_GRAY);
        }
    }

    public static void main(String[] args) {
        new SwingEle();
    }
}
