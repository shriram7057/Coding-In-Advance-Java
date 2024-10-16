// package LayoutManagers;
import javax.swing.*;
import java.awt.*;
public class GridLayoutEx extends JFrame{
    GridLayoutEx(){
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

//        GridLayout g=new GridLayout();
        //To set no. of rows and columns
        GridLayout g=new GridLayout(3,2);

        //to add hgap and vgap
//        g.setHgap(20);
//        g.setVgap(10);
        c.setLayout(g);
    }

    public static void main(String[] args) {
        GridLayoutEx ge=new GridLayoutEx();
    }
}
