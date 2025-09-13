import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class JOptionPaneDemo extends JFrameDemo implements ActionListener {
    JButton button;

    JOptionPaneDemo() {
        // Set up the frame
        setLayout(new FlowLayout());
        java.awt.Container c = getContentPane();
        c.setBackground(Color.LIGHT_GRAY);

        // Create and add a button
        button = new JButton("Show Message Dialog");
        button.addActionListener(this);
        c.add(button);

        // Frame settings
        setTitle("JOptionPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Show a message dialog when the button is clicked
        JOptionPane.showMessageDialog(this, "This is a message dialog", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Create and display the frame
        JOptionPaneDemo demo = new JOptionPaneDemo();
        demo.setVisible(true);
    }
}
