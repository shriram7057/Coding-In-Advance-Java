import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Frame1 extends JFrameDemo
{
    JPanel pane=new JPanel();
    Frame1()
    {
        super("My simple frame");
        setBounds(100,100,300,300);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
        java.awt.Container con=this.getContentPane();
        con.add(pane);
        setVisible(true);
    } 
    public static void main(String[] args) {
        new Frame1();
    }
}