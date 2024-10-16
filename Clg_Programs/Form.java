import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form extends JFrame implements ActionListener 
{
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6;
    TextField tf1, tf2, tf3, tf4;
    JComboBox<String> departmentComboBox;

    Form() 
    {
        setLayout(null);
        setBackground(Color.CYAN);
        l5 = new JLabel(" ");
        l5.setBounds(140, 300, 200, 20);
        add(l5);

        l1 = new JLabel("Enter Your Name:");
        l1.setBounds(20, 50, 120, 30);
        tf1 = new TextField(30);
        tf1.setBounds(150, 55, 180, 20);
        l1.setForeground(Color.RED);
        add(l1);
        add(tf1);

        l2 = new JLabel("Enter Your Address:");
        l2.setBounds(20, 80, 120, 30);
        tf2 = new TextField(30);
        tf2.setBounds(150, 85, 180, 20);
        l2.setForeground(Color.RED);
        add(l2);
        add(tf2);

        l3 = new JLabel("Enter Contact Number:");
        l3.setBounds(20, 115, 135, 30);
        tf3 = new TextField(30);
        tf3.setBounds(160, 120, 180, 20);
        l3.setForeground(Color.RED);
        add(l3);
        add(tf3);

        l4 = new JLabel("Enter Email:");
        l4.setBounds(20, 150, 100, 30);
        tf4 = new TextField(30);
        tf4.setEchoChar('*');
        l4.setForeground(Color.RED);
        tf4.setBounds(150, 160, 180, 20);
        add(l4);
        add(tf4);
        
        l6 = new JLabel("Select Department:");
        l6.setBounds(20, 190, 120, 30);
        departmentComboBox = new JComboBox<>(new String[] {"Computer", "IT", "Chemical", "Electrical"});
        departmentComboBox.setBounds(150, 195, 180, 20);
        l6.setForeground(Color.RED);
        departmentComboBox.setForeground(Color.RED);
        add(l6);
        add(departmentComboBox);
        
        b1 = new JButton("Submit");
        b1.setBounds(150, 240, 90, 25);
        add(b1);
        b1.setForeground(Color.RED);
        b2 = new JButton("Cancel");
        b2.setBounds(250, 240, 90, 25);
        b2.setForeground(Color.RED);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == b1) 
        {
            l5.setText("Form Submitted Successfully");
        } else if (e.getSource() == b2) 
        {
            l5.setText("Form Not Submitted");
        }
    }

    public static void main(String[] args) 
    {
        Form f = new Form();
        f.setVisible(true);
        f.setTitle("Form");
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
