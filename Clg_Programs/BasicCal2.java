import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BasicCal2 extends JFrame implements ActionListener 
{
    JLabel l1 = new JLabel("Num1");
    JLabel l2 = new JLabel("Num2");
    JLabel l3 = new JLabel("Result");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Sub");
    JButton b3 = new JButton("Mul");
    JButton b4 = new JButton("Div");

    BasicCal2() 
    {
        setBackground(Color.CYAN);
        setLayout(null);

        l1.setBounds(50, 100, 100, 20);
        l2.setBounds(50, 140, 100, 20);
        l3.setBounds(50, 180, 100, 20);

        t1.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 140, 100, 20);
        t3.setBounds(200, 180, 100, 20);

        b1.setBounds(50, 250, 50, 20);
        b2.setBounds(110, 250, 50, 20);
        b3.setBounds(170, 250, 50, 20);
        b4.setBounds(230, 250, 50, 20);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int Num1 = Integer.parseInt(t1.getText());
        int Num2 = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            t3.setText(String.valueOf(Num1 + Num2));
        }
        if (e.getSource() == b2) {
            t3.setText(String.valueOf(Num1 - Num2));
        }
        if (e.getSource() == b3) {
            t3.setText(String.valueOf(Num1 * Num2));
        }
        if (e.getSource() == b4) {
            t3.setText(String.valueOf(Num1 / Num2));
        }
    }

    public static void main(String[] args) {
        new BasicCal();
        // BasicCal.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
