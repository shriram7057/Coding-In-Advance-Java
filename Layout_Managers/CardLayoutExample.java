import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample extends JFrame implements ActionListener { 
    CardLayout card; 
    JButton b1, b2, b3; 
    java.awt.Container c;

    CardLayoutExample() { 
        // Setup JFrame
        setTitle("CardLayout Example"); // Set a title for the JFrame
        setSize(400, 400); // Set the size of the JFrame
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Close application when window is closed

        // Initialize CardLayout and Container
        card = new CardLayout(40, 30); // Initialize CardLayout with horizontal and vertical gaps
        c = getContentPane();
        c.setLayout(card); // Set the layout of the container

        // Create Buttons
        b1 = new JButton("Apple");
        b2 = new JButton("Boy");
        b3 = new JButton("Cat");

        // Add ActionListener to buttons
        b1.addActionListener(this);
        b2.addActionListener(this); 
        b3.addActionListener(this); 

        // Add buttons to the container with identifiers
        c.add("Apple", b1);
        c.add("Boy", b2);
        c.add("Cat", b3);

        // Display the initial card
        card.show(c, "Apple");
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        card.next(c); // Move to the next card in the layout
    }

    public static void main(String[] args) {
        // Ensure GUI updates are done on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutExample().setVisible(true);
            }
        });
    }
}
