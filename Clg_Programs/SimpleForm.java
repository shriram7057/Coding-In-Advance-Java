import java.awt.*;
import java.awt.event.*;

public class SimpleForm extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    Button submit;

    SimpleForm() {
        // Set layout to null for absolute positioning
        setLayout(null);
        setBackground(Color.CYAN);

        // Create and add components
        l1 = new Label("Name:");
        tf1 = new TextField(20);
        l1.setForeground(Color.RED);

        l2 = new Label("Email:");
        tf2 = new TextField(20);
        l2.setForeground(Color.RED);

        l3 = new Label("Password");
        tf3 = new TextField(10);
        l3.setForeground(Color.RED);

        submit = new Button("Submit");
        submit.addActionListener(this);
        submit.setForeground(Color.RED);

        // Set bounds for each component
        l1.setBounds(50, 50, 100, 30);
        tf1.setBounds(160, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        tf2.setBounds(160, 100, 150, 30);

        l3.setBounds(50, 150, 100, 30);
        tf3.setBounds(160, 150, 150, 30);

        submit.setBounds(150, 200, 80, 30);

        // Add components to frame
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(submit);

        tf3.setEchoChar('*');

        // Frame settings
        setTitle("Simple AWT Form");
        setSize(400, 350);
        setVisible(true);

        // // Close the frame when the user clicks the close button
        // addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent we) {
        //         dispose();
        //     }
        // });
    }

    // ActionListener method to handle button click
    public void actionPerformed(ActionEvent e) {
        String name = tf1.getText();
        String email = tf2.getText();
        System.out.println("Name: " + name + ", Email: " + email);
    }

    public static void main(String[] args) {
        new SimpleForm();
    }
}
