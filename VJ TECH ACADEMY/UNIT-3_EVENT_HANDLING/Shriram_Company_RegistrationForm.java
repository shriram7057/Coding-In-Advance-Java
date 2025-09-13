import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shriram_Company_RegistrationForm extends JFrameDemo implements ActionListener {
    // Components of the Form
    private JTextField companyNameField, addressField, emailField, phoneField;
    private JComboBox<String> companyTypeComboBox;
    private JButton submitButton, resetButton;

    // Constructor to setup GUI components
    public Shriram_Company_RegistrationForm() {
        // Frame setup\
        setBackground(Color.CYAN);
        setTitle("Software Company Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Company Name
        JLabel companyNameLabel = new JLabel("Company Name:");
        companyNameLabel.setBounds(50, 50, 100, 30);
        add(companyNameLabel);

        companyNameField = new JTextField();
        companyNameField.setBounds(180, 50, 150, 30);
        add(companyNameField);
        companyNameField.setBackground(Color.CYAN);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 100, 100, 30);
        add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(180, 100, 150, 30);
        add(addressField);
        addressField.setBackground(Color.CYAN);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 150, 100, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(180, 150, 150, 30);
        add(emailField);
        emailField.setBackground(Color.CYAN);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 200, 100, 30);
        add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(180, 200, 150, 30);
        add(phoneField);
        phoneField.setBackground(Color.CYAN);

        // Company Type
        JLabel companyTypeLabel = new JLabel("Company Type:");
        companyTypeLabel.setBounds(50, 250, 100, 30);
        add(companyTypeLabel);

        String[] companyTypes = { "Product-based", "Service-based", "Startup" };
        companyTypeComboBox = new JComboBox<>(companyTypes);
        companyTypeComboBox.setBounds(180, 250, 150, 30);
        add(companyTypeComboBox);
        companyTypeComboBox.setBackground(Color.CYAN);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(50, 300, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);
        submitButton.setForeground(Color.RED);
        // Reset Button
        resetButton = new JButton("Reset");
        resetButton.setBounds(180, 300, 100, 30);
        resetButton.addActionListener(this);
        add(resetButton);
        resetButton.setForeground(Color.RED);
    }

    // Method to define actions for buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Fetch and display the data entered by the user
            String companyName = companyNameField.getText();
            String address = addressField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String companyType = (String) companyTypeComboBox.getSelectedItem();

            JOptionPane.showMessageDialog(this, "Company Name: " + companyName
                    + "\nAddress: " + address
                    + "\nEmail: " + email
                    + "\nPhone: " + phone
                    + "\nCompany Type: " + companyType, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == resetButton) {
            // Reset all fields
            companyNameField.setText("");
            addressField.setText("");
            emailField.setText("");
            phoneField.setText("");
            companyTypeComboBox.setSelectedIndex(0);
        }
    }

    // Main Method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Shriram_Company_RegistrationForm().setVisible(true);
        });
    }
}