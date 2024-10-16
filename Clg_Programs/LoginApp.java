import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {
    public static void main(String[] args) {
        // Create a JFrame (window) for our login page
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 100, 30);

        // Add an ActionListener to the button using an anonymous inner class
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code will execute when the button is clicked
                JOptionPane.showMessageDialog(null, "Login successful!");
            }
        });

        // Add the button to the frame
        frame.add(loginButton);

        // Set the frame visible
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
