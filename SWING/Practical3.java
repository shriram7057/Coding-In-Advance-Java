import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Practical3 extends JFrameDemo implements ActionListener
{
    JButton b1,b2;
    JLabel l1, l2, l3, l4, l5, l6, l7,l8,l9,l10;
    JTextField jt1, jt2, jt3, jt4, jt5;
    JTextArea jta;
    JList jl1;
    JComboBox<String> jc1, jc2,jc3; 
    java.awt.Container c;

    Practical3() {
        c = getContentPane();
        setLayout(null);
        setTitle("Practice Program");
        setBounds(100, 100, 600, 600);
        c.setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter Your Name");
        l1.setBounds(50, 50, 100, 30);
        c.add(l1);

        jt1 = new JTextField();
        jt1.setBounds(180, 50, 150, 25);
        c.add(jt1);

        l2 = new JLabel("Enter Your College");
        l2.setBounds(50, 80, 120, 25);
        c.add(l2);

        jt2 = new JTextField();
        jt2.setBounds(180, 80, 150, 25);
        c.add(jt2);

        l3 = new JLabel("Enter Email id");
        l3.setBounds(70, 110, 120, 25);
        c.add(l3);

        jt3 = new JTextField();
        jt3.setBounds(190, 110, 120, 25);
        c.add(jt3);

        l4 = new JLabel("Enter Roll No");
        l4.setBounds(70, 140, 120, 25);
        c.add(l4);  

        jt4 = new JTextField();
        jt4.setBounds(190, 140, 120, 25);
        c.add(jt4);

        l5 = new JLabel("Enter PRN No");
        l5.setBounds(70, 170, 120, 25);
        c.add(l5);

        jt5 = new JTextField();
        jt5.setBounds(190, 170, 120, 25);
        c.add(jt5);

        l6 = new JLabel("Select Your Department");
        l6.setBounds(30, 200, 140, 25);
        c.add(l6);

        
        String[] departments = { "Computer", "IT", "Petro", "Chem", "Elect", "Civil", "Mech" };
        jc1 = new JComboBox<>(departments);
        jc1.setBounds(200, 200, 150, 25);
        c.add(jc1);

        l7 = new JLabel("Select Your Passout Year");
        l7.setBounds(30, 240, 160, 25);
        c.add(l7);

        
        String[] years = { "2019-20", "2020-21", "2021-22", "2023-24", "2024-25" };
        jc2 = new JComboBox<>(years);
        jc2.setBounds(200, 240, 150, 25);
        c.add(jc2);

        l8=new JLabel("Select Your Cast");
        l8.setBounds(80,280,140,25);
        c.add(l8);

        String[] Caste={"Open","OBC","SC","ST","VJNT"};
        jc3=new JComboBox<>(Caste);
        jc3.setBounds(200,280,150,25);
        c.add(jc3);

        b1=new JButton("Submit");
        b1.setBounds(200,330,80,25);
        c.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(310,330,80,25);
        c.add(b2);

        setVisible(true);
        l9=new JLabel();
        l9.setBounds(200,380,200,30);
        c.add(l9);
        l10=new JLabel();
        l10.setBounds(200,380,200,30);
        c.add(l10);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            l9.setText("Form Submitted Succesfully");
        }
        else if (e.getSource()==b2)
        {
            l10.setText("Form Canceld Succesfully");
        }
    }

    public static void main(String[] args) {
        new Practical3();
    }
}
