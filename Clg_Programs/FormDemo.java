import javax.swing.*;
import java.awt.*;
class FormDemo extends JFrameDemo  
{
    FormDemo()
    {
        java.awt.Container c=getContentPane();
        // setLayout(null);
        // setBackground(Color.CYAN);
        // setSize(500,500);
        // setVisible(true);
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(50,100,50,40);
        c.add(l1);
        
        JPasswordField jp=new JPasswordField();
        jp.setText("Password");
        jp.setBounds(50,150,50,40);
        c.add(jp);
    }
    public static void main(String[] args) {
      FormDemo f1 =new FormDemo();
      f1.setSize(500,500);
      f1.setBackground(Color.CYAN);
      f1.setVisible(true);
    }
}