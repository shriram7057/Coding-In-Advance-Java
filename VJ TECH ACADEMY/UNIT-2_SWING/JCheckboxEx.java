import javax.swing.*;
import java.awt.*;

class JCheckboxEx extends JFrame 
{
    JCheckboxEx() 
    {
        setVisible(true);
        setBounds(200, 100, 400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        java.awt.Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        JCheckBox jc = new JCheckBox("9th");
        JCheckBox jc1 = new JCheckBox("10th");
        JCheckBox jc2 = new JCheckBox("11th");
        JCheckBox jc3 = new JCheckBox("12th");

        // Adjusted bounds for each Check box
        jc.setBounds(50, 100, 100, 50);
        jc1.setBounds(50, 160, 100, 50);
        jc2.setBounds(50, 220, 100, 50);
        jc3.setBounds(50, 280, 100, 50);

        c.add(jc);
        c.add(jc1);
        c.add(jc2);
        c.add(jc3);

        Font f1 = new Font("Times New Roman", Font.PLAIN, 20); // Declare Font

        // Apply the font to all checkboxes
        jc.setFont(f1);
        jc1.setFont(f1);
        jc2.setFont(f1); 
        jc3.setFont(f1);

        jc2.setSelected(true);  //Currently selected  the checkbox
        
       // jc1.setEnabled(false); //no any actions performed to jc1 Checkbox
    }

    public static void main(String[] args) {
        JCheckboxEx jcb = new JCheckboxEx();
    }
}
