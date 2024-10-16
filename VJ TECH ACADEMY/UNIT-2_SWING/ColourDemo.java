import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ColourDemo extends JFrame implements ActionListener 
{
    JButton j1, j2, j3;
    java.awt.Container c;
    ColourDemo() 
    {
      c=getContentPane();
        c.setLayout(null);

        Font f1=new Font("Forte",Font.BOLD,15); 
        j1 = new JButton("ORANGE");
        j1.setBounds(70, 100, 100, 30); 
        c.add(j1);
        j1.setFont(f1);

        j2 = new JButton("RED");
        j2.setBounds(180, 100, 100, 30); 
        c.add(j2);
        j2.setFont(f1);

        j3 = new JButton("GREEN");
        j3.setBounds(290, 100, 100, 30); 
        c.add(j3);
        j3.setFont(f1);

        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);

       
        setTitle("Colour Demo");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == j1) 
        {
            c.setBackground(Color.ORANGE);
        } 
        else if (e.getSource() == j2) 
        {
            c.setBackground(Color.RED);
        } 
        else if (e.getSource() == j3) 
        {
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) 
    {
        new ColourDemo();
    }
}
