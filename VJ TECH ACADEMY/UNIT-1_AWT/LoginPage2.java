import java.awt.*;
import java.awt.event.*;
public class LoginPage2 extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField tf1,tf2;
    LoginPage2()
    {
        setLayout(null);
        setBackground(Color.cyan);
        setForeground(Color.red);
        Font f1=new Font("Arial Black",Font.BOLD,25);
        setFont(f1);
        Font f2=new Font("Arial Black",Font.BOLD|Font.ITALIC,18);

         l1=new Label("SHRIRAM SOFTWARE PVT LTD");
         l1.setFont(f2);
         l2=new Label("Enter User Name",Label.RIGHT);
         l3=new Label("Enter Password",Label.RIGHT);
         l4=new Label("              ");

         tf1=new TextField(30);
         tf2=new TextField(30);
        Button b1=new Button("Login");

        l1.setBounds(150, 120, 300, 30);
        l2.setBounds(80,150,200,30);

        tf1.setBounds(300,150,200,30);
        l3.setBounds(80,220,200,30);

        tf2.setBounds(300,220,200,30);
        b1.setBounds(250,300,150,50);

        l4.setBounds(260,350,200,30);
        tf2.setEchoChar('*');
      //  setFont(f1);

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(b1);
        add(l4);
        b1.addActionListener(this);
    } 
    public void actionPerformed(ActionEvent e)
    {
       String uname=tf1.getText();
       String psw=tf2.getText();
       if(uname.equals("shriram")&&psw.equals("shriram"))
       {
        l4.setText("Login success!");
       }
       else{
        l4.setText("Login Faild!");
       }
    }  
    public static void main(String[] args) {
        LoginPage2 lg=new LoginPage2();
        lg.setVisible(true);
        lg.setSize(600, 500);
        lg.setTitle("Login Form");
    }
}