import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form extends Frame implements ActionListener 
{
    Button b1, b2;
    Label l1, l2, l3, l4, l5, l6, l7;
    TextField tf1, tf2, tf3, tf4;
    Choice d1;
    TextField passwordField; // Added for password input

    Form() 
    {
        setLayout(null);
        setBackground(Color.CYAN);

        l5 = new Label(" ");
        l5.setBounds(160, 400, 300, 20);  // Adjusted position for message
        add(l5);

        l1 = new Label("Enter Your Name:");
        l1.setBounds(20, 50, 150, 30);  // Increased width for label
        tf1 = new TextField(30);
        tf1.setBounds(180, 55, 250, 20);  // Increased width for TextField
        l1.setForeground(Color.RED);
        add(l1);
        add(tf1);

        l2 = new Label("Enter Your Address:");
        l2.setBounds(20, 100, 150, 30);  // Adjusted position and size
        tf2 = new TextField(30);
        tf2.setBounds(180, 105, 250, 20);  // Increased width for TextField
        l2.setForeground(Color.RED);
        add(l2);
        add(tf2);

        l3 = new Label("Enter Contact Number:");
        l3.setBounds(20, 150, 150, 30);
        tf3 = new TextField(30);
        tf3.setBounds(180, 155, 250, 20);
        l3.setForeground(Color.RED);
        add(l3);
        add(tf3);

        l4 = new Label("Enter Email:");
        l4.setBounds(20, 200, 150, 30);
        tf4 = new TextField(30);
        tf4.setBounds(180, 205, 250, 20);
        l4.setForeground(Color.RED);
        add(l4);
        add(tf4);

        // Added Password label and field
        l7 = new Label("Enter Email Password:");
        l7.setBounds(20, 250, 150, 30);
        passwordField = new TextField(30);
        passwordField.setBounds(180, 255, 250, 20);
        passwordField.setEchoChar('*'); // Mask the input for password
        l7.setForeground(Color.RED);
        add(l7);
        add(passwordField);

        l6 = new Label("Select Department:");
        l6.setBounds(20, 300, 150, 30);

        d1 = new Choice();
        d1.add("Computer");
        d1.add("IT");
        d1.add("Chemical");
        d1.add("Electrical");
        d1.setBounds(180, 305, 250, 20);
        l6.setForeground(Color.RED);
        add(l6);
        add(d1);

        b1 = new Button("Submit");
        b1.setBounds(180, 350, 90, 30);  // Adjusted position
        add(b1);
        b1.setForeground(Color.RED);

        b2 = new Button("Cancel");
        b2.setBounds(280, 350, 90, 30);
        b2.setForeground(Color.RED);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        // Set the size of the frame to 600x600
        setSize(600, 600);
        setVisible(true);
        setTitle("Form");
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
        new Form();
    }
}
