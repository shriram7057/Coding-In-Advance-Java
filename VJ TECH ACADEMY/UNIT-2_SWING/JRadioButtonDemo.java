import javax.swing.*;
import java.awt.*;

class JRadioButtonDemo extends JFrameDemo {
    JRadioButtonDemo() 
    {
        setVisible(true);
        setBounds(100, 100, 800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        java.awt.Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        JRadioButton jrd1 = new JRadioButton("Male");
        JRadioButton jrd2 = new JRadioButton("Female");

        jrd1.setBounds(100, 50, 80, 25); // Adjusted y-position
        jrd2.setBounds(200, 50, 80, 25); // Adjusted y-position

        c.add(jrd1);
        c.add(jrd2);

        JRadioButton General = new JRadioButton("General");
        JRadioButton Open = new JRadioButton("Open");
        JRadioButton SC = new JRadioButton("SC");
        JRadioButton ST = new JRadioButton("ST");

        General.setBounds(50, 150, 100, 30);
        Open.setBounds(150, 150, 100, 30);
        SC.setBounds(250, 150, 100, 30);
        ST.setBounds(350, 150, 100, 30);

        ButtonGroup Caste = new ButtonGroup();
        Caste.add(General);
        Caste.add(Open);
        Caste.add(SC);
        Caste.add(ST);

        c.add(General);
        c.add(Open);
        c.add(SC);
        c.add(ST);

        Font F1=new Font("Arial Black",Font.BOLD,15);

        Open.setFont(F1);
        General.setFont(F1);
        SC.setFont(F1);
        ST.setFont(F1);

        Open.setSelected(true);
        Open.setEnabled(false);
    }

    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
