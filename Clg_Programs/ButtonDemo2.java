import java.awt.*;

public class ButtonDemo2 extends Frame {
    public ButtonDemo2() {
        // Set up the Frame
        setSize(300, 400);
        setTitle("Button Demo");
        setLayout(new FlowLayout()); // Set the layout manager to FlowLayout
        setBackground(Color.cyan); // Set the background color

        // Create buttons
        Button b1 = new Button("India");
        Button b2 = new Button("Japan");
        Button b3 = new Button("America");

        // Add buttons to the Frame
        add(b1);
        add(b2);
        add(b3);
    }
    public static void main(String args[])
    {
        ButtonDemo2 b=new ButtonDemo2();
        b.setVisible(true);
        b.setTitle("ButtonDemo2");
        b.setSize(300,300);
    }
}
