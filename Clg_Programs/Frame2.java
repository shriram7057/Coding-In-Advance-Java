import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Frame2 extends JFrameDemo
{
    private static final Container p = null;
    Component pane=new Panel();
    JButton pressme = new JButton("Press Me");
    @Override
    public void setDefaultCloseOperation(int operation) {
        // TODO Auto-generated method stub
        super.setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
        java.awt.Container con=this.getContentPane();
        con.add(pane);
        pressme.setMnemonic('p');
        p.add(pressme);
        pressme.requestFocus();
        setVisible(true);
    }
    public static void main(String[] args) {
        new Frame2();
    }
}