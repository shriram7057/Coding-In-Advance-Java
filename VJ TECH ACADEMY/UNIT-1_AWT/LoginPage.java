import java.awt.*;
import java.awt.event.*;

class LoginDemo extends Frame implements ActionListener 
{
    Label L1, L2, L3, L4;
    TextField tf1, tf2;
    Button b1;

    LoginDemo() 
	{
        setLayout(null);

        setBackground(Color.cyan);
        setForeground(Color.red);

        Font f = new Font("Arial Black", Font.BOLD , 20);
        Font f1 = new Font("Arial Black", Font.BOLD, 15);
        setFont(f1);

        L1 = new Label("D.BATU WIFI ACCESS");
        L1.setFont(f);
        L1.setForeground(Color.blue);

        L2 = new Label("Enter User Name:");
        L3 = new Label("Enter Password:");
        L4 = new Label("                              ");
        tf1 = new TextField(30);
        tf2 = new TextField(30);
        b1 = new Button("Login");

        L1.setBounds(145, 80, 450, 20);
        L2.setBounds(80, 150, 200, 30);
        tf1.setBounds(300, 150, 200, 25);

        L3.setBounds(80, 220, 200, 30);
        tf2.setBounds(300, 220, 200, 25);
        b1.setBounds(200, 300, 150, 30);

        L4.setBounds(200, 340, 200, 30);
        tf2.setEchoChar('*');

        add(L1);
        add(L2);
        add(tf1);
        add(L3);
        add(tf2);
        add(b1);
        add(L4);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String username = tf1.getText();
        String password = tf2.getText();

        if (!username.isEmpty() && !password.isEmpty()) 
		{
            L4.setText("Login Success");
        } else 
		{
            L4.setText("Login Failed");
        }
    }

    public static void main(String args[]) 
	{
        LoginDemo f1 = new LoginDemo();
        f1.setVisible(true);
        f1.setTitle("Login Form");
        f1.setSize(600, 450);
    }
}
