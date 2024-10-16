import java.awt.*;
import javax.swing.*;

class JComboboxEx extends JFrame 
{
    JComboboxEx() 
    {
        java.awt.Container c = getContentPane();
        setLayout(null);
        setSize(500, 500);
        c.setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JComboBox Example");

        // String array with values
        String[] values = {"A", "B", "C", "D"};
        JComboBox<String> comboBox = new JComboBox<>(values);
        comboBox.setBounds(50, 50, 100, 30);  
        
        //comboBox.setSelectedIndex(2);          using index method

        comboBox.setSelectedItem("A"); //using set selected method
        c.add(comboBox);                        // Add JComboBox to container
        Font f1=new Font("Times New Roman",Font.BOLD,20);
        comboBox.setFont(f1);

        //c.setBackground(Color.CYAN); set the background colour
        setVisible(true); 
    }

    public static void main(String args[]) {
        new JComboboxEx();
    }
}
