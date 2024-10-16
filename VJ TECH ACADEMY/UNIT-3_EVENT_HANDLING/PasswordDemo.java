import java.awt.*;
import java.awt.event.*;
class PasswordDemo extends Frame implements ActionListener
{
	Label L1;
	Button b1;
	TextField tf1;
	PasswordDemo()
	{
		setLayout(new FlowLayout());
		L1=new Label("Enter Password:");
		tf1=new TextField(30);
		b1=new Button("Show Password");
		tf1.setEchoChar('*');
		add(L1);
		add(tf1);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Show Password"))
		{
			b1.setLabel("Hide Password");
			tf1.setEchoChar('\0');
		}
		else
		{
			b1.setLabel("Show Password");
			tf1.setEchoChar('*');			
		}
	}
	public static void main(String args[])
	{
		PasswordDemo p1=new PasswordDemo();
		p1.setVisible(true);
		p1.setSize(500,500);
		p1.setTitle("VJTech Frame");
	}
}