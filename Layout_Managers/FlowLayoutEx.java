// package LayoutManagers;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame{
    FlowLayoutEx(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,300);
        java.awt.Container c=getContentPane();

        JButton b1=new JButton("Btn1");
        JButton b2=new JButton("Btn2");
        JButton b3=new JButton("Btn3");
        JButton b4=new JButton("Btn4");
        JButton b5=new JButton("Btn5");

        c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);

//        FlowLayout f=new FlowLayout();

        // To align content on left side
//        FlowLayout f=new FlowLayout(FlowLayout.LEFT);

        //to set horizontal and vertical gap 10 is hgap,20 is vgap
        FlowLayout f=new FlowLayout(FlowLayout.LEFT,10,20);

        //another way to set hgap and vgap
//        f.setHgap(10);
//        f.setVgap(20);
        c.setLayout(f);
    }

    public static void main(String[] args) {
        FlowLayoutEx fe=new FlowLayoutEx();
    }
}
