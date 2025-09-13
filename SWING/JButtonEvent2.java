import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JButtonEvent2 extends JFrameDemo implements ActionListener {
    java.awt.Container c;
    JButton jb, jb1,jb2;
    JButtonEvent2(){

            setVisible(true);
            setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
            setBounds(100,100,600,500);

            c=getContentPane();
            c.setLayout(null);
            c.setBackground(Color.gray);

            jb=new JButton("Click Here");
            jb.setBounds(100,100,100,30);
            jb1=new JButton("Click Here");
            jb1.setBounds(250,100,100,30);
            jb2=new JButton("Click Here");
            jb2.setBounds(400,100,100,30);

            c.add(jb);c.add(jb1);c.add(jb2);

            jb.addActionListener(this);
            jb1.addActionListener(this);
            jb2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb){
            c.setBackground(Color.cyan);
        }
        if(e.getSource()==jb1){
            c.setBackground(Color.ORANGE);
        }
        if(e.getSource()==jb2){
            c.setBackground(Color.DARK_GRAY);
        }
    }
    public static void main(String[] args) {
        JButtonEvent2 jb=new JButtonEvent2();
    }
}
