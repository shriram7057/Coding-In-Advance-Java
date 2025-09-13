import javax.swing.*;
import java.awt.*;
public class JButtonExample extends JFrameDemo{
    JButtonExample(){
        setVisible(true);
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        java.awt.Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JButton jb=new JButton("Click Here");
        jb.setBounds(100,100,100,30);
        c.add(jb);

        //change font
        Font f=new Font("Times New Roman",Font.BOLD,12);
        jb.setFont(f);

        //Change text
//        jb.setText("submit");

        //Change colour
        jb.setForeground(Color.RED);
        jb.setBackground(Color.GREEN);

        //change mouse pointer
//        Cursor cu=new Cursor(Cursor.HAND_CURSOR);
//        jb.setCursor(cu);
//        Cursor cu1=new Cursor(Cursor.CROSSHAIR_CURSOR);
//        jb.setCursor(cu1);
        Cursor cu2=new Cursor(Cursor.WAIT_CURSOR);
        jb.setCursor(cu2);

        //enable and disable button
//        jb.setEnabled(false);

        //Dont want to show button
        jb.setVisible(false);

//        set image on button

    }
    public static void main(String[] args) {
        JButtonExample jb=new JButtonExample();
    }
}




