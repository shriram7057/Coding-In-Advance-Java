import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class ColourDemo2 extends JFrame implements ActionListener 
{
    JButton b1;
    java.awt.Container c;

    ColourDemo2() 
    {
        setVisible(true);
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        b1 = new JButton("BLUE");
        b1.setBounds(80, 100, 100, 50); // Adjusted size for better visibility
        
        b1.setForeground(Color.BLUE);
        b1.addActionListener(this); // Added ActionListener to the button
        c.add(b1);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == b1) 
        {
            c.setBackground(Color.BLUE); // Set background of the container, not the JFrame
        }
    }

    public static void main(String args[]) 
    {
        new ColourDemo2();
    }
}
