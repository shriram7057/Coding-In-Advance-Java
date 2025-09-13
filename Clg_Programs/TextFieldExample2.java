import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample2 implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    TextFieldExample2() {
        JFrameDemo f = new JFrameDemo("Add/Substract");
        tf1 = new JTextField();
        tf1.setBounds(100, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(100, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(100, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 40);
        b2 = new JButton("-");
        b2.setBounds(120, 200, 50, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);

        JLabel l1, l2, l3;
        l1 = new JLabel("First Number");
        l1.setBounds(5, 35, 100, 50);
        l2 = new JLabel("Second Number");
        l2.setBounds(5, 85, 100, 50);
        l3 = new JLabel("Result");
        l3.setBounds(5, 135, 100, 50);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1)
            c = a + b;
        else if (e.getSource() == b2)
            c = a - b;
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new TextFieldExample2();
    }
}