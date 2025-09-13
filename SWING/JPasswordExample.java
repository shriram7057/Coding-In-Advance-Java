import javax.swing.*;
import java.awt.*;
public class JPasswordExample extends JFrameDemo 
{
    JPasswordExample()
    {
    setVisible(true);
    setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
    setBounds(100,100,600,500);
    java.awt.Container c=getContentPane();

        c.setLayout(null);
        c.setBackground(Color.CYAN);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(100,50,120,25);
        c.add(pass);

        //change the size of font
        Font f=new Font("Arial",Font.PLAIN,20);
        pass.setFont(f);

        //set Foreground and background

//        replace dot with *
        pass.setEchoChar('*');

        //To show password
        //pass.setEchoChar((char)0);
    }

    public static void main(String[] args) {
        JPasswordExample jp=new JPasswordExample();
    }
}
