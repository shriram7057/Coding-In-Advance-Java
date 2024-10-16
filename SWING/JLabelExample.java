import javax.swing.*;
import java.awt.*;

public class JLabelExample extends JFrame {
    JLabelExample(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        java.awt.Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JLabel l1=new JLabel("Username");
        l1.setBounds(100,50,200,30);
//        l1.setText("UserID");

        Font f=new Font("Arial",Font.ITALIC,30);
        l1.setFont(f);

        l1.setBackground(Color.RED);
        l1.setForeground(Color.RED);
        c.add(l1);
    }

    public static void main(String[] args) {
        JLabelExample jl=new JLabelExample();
    }
}
