import javax.swing.*;
import java.awt.*;
class Login extends JFrame
{
    Login()
    {
        java.awt.Container c=getContentPane();
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel l2=new JLabel();
        l2.setText("Username");
        l2.setBounds(50,100,100,50);
        c.add(l2);

        JLabel l3=new JLabel();
        l3.setText("Password");
        l3.setBounds(50,150,100,50);
        c.add(l3);

        JTextField jt=new JTextField();
        jt.setBounds(100,200,50,50);
        c.add(jt);
    }
    public static void main(String[] args) {
        Login l1=new Login();
    }
}