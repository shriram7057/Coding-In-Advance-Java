import java.awt.Button; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import javax.swing.*; 
import java.awt.*;

        public class GroupLayoutExample
        {
            public static void main(String[] args) 
        { 
            JFrame frame = new JFrame("GroupLayoutExample"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        java.awt.Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(groupLayout);
        JLabel clickMe = new JLabel("Click Here"); 
        JButton button = new JButton("This Button"); 

        groupLayout.setHorizontalGroup( groupLayout.createSequentialGroup() 

        .addComponent(clickMe) 
        .addGap(10, 20, 100) 
        .addComponent(button)); 

        groupLayout.setVerticalGroup( groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE) .addComponent(clickMe) .addComponent(button)); 
        frame.pack();
        frame.setSize(300,300);
        frame.setVisible(true); 
} 
}