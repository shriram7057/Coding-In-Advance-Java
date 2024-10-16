import java.awt.*;
import java.awt.event.*;

class LoginPage2 extends Frame {
    TextField tf1, tf2;
    Button b1;
    Label l1, l2;

    LoginPage2() {
        // Use null layout for manual positioning
        setLayout(null);

        // Initialize components
        l1 = new Label("Username:");
        tf1 = new TextField(20);
        l2 = new Label("Password:");
        tf2 = new TextField(20);
        tf2.setEchoChar('*'); // Hide password input
        b1 = new Button("Login");

        // Set bounds for each component (x, y, width, height)
        l1.setBounds(50, 50, 80, 30);
        tf1.setBounds(150, 50, 100, 30);
        l2.setBounds(50, 100, 80, 30);
        tf2.setBounds(150, 100, 100, 30);
        b1.setBounds(100, 150, 80, 30); // Place the button at the bottom

        // Add components to the frame
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);

        // Add action listener for the button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic for login action
                String username = tf1.getText();
                String password = tf2.getText();
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("Login button clicked");
            }
        });

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setTitle("Login Page");
        setSize(300, 250); // Adjust size to fit components
    }

    public static void main(String[] args) {
        LoginPage2 l1 = new LoginPage2();
        l1.setVisible(true);
    }
}
