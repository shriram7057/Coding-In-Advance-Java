import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame3 extends JFrameDemo implements ActionListener {
    JLabel answer = new JLabel("");
    JPanel pane = new JPanel(); // Corrected the JPanel declaration
    JButton pressme = new JButton("Press Me");

    // Constructor
    public Frame3() { // Added constructor parentheses
        super("Event Handler Demo");
        setBounds(100, 100, 300, 300);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);

        java.awt.Container con = this.getContentPane(); // Corrected method name

        con.add(pane);
        pressme.setMnemonic('p');
        pressme.addActionListener(this);
        pane.add(answer);
        pane.add(pressme);
        pressme.requestFocus();
        setVisible(true);
    }

    // Event handler method
    @Override
    public void actionPerformed(ActionEvent e) { // Corrected method name and signature
        Object source = e.getSource(); // Corrected variable name
        if (source == pressme) {
            answer.setText("Button Pressed");
            JOptionPane.showMessageDialog(null, "I hear you", "MessageDialog", JOptionPane.PLAIN_MESSAGE); // Corrected spelling
        }
    }

    public static void main(String[] args) {
        new Frame3();
    }
}
