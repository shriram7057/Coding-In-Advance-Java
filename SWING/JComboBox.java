import java.awt.*;
import javax.swing.*;

class JComboboxEx extends JFrameDemo 
{
    JComboboxEx() 
    {
        java.awt.Container c = getContentPane();
        setLayout(null);
        setSize(500, 500);
        c.setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
        setTitle("JComboBox Example");

        // String array with values
        String[] values = {"S", "H", "R", "I"};
        JComboBox<String> comboBox = new JComboBox<>(values);
        comboBox.setBounds(50, 50, 100, 30);         
      c.setBackground(Color.CYAN); //set the background colour
        setVisible(true); 
        c.add(comboBox);
    }

    public static void main(String args[]) 
    {
        new JComboboxEx();
    }
}
