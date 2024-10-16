import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    public static void main(String[] args) {
        Frame f = new Frame("ActionListener Example");

        // Create a text field
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        // Create a button
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);

        // Register the button with the ActionListener
        b.addActionListener(new ActionListenerExample());

        // Add components to the frame
        f.add(b);
        f.add(tf);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    private TextField tf;

    // Override the actionPerformed method
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to Javatpoint.");
    }
}
