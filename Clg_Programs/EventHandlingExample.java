import java.awt.*;
import java.awt.event.*;

// Outer class that implements ActionListener
class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked! Welcome to Java Event Handling.");
    }
}

public class EventHandlingExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Java Event Handling Example");

        // Create a button
        Button button = new Button("Click Me!");
        button.setBounds(100, 100, 80, 30);

        // Register the button with the outer class listener
        button.addActionListener(new MyActionListener());

        // Add the button to the frame
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
