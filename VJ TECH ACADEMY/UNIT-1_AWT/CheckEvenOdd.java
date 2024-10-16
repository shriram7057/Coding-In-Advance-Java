//Check Even Or ODD
import java.awt.*;
import java.awt.event.*;
class CheckEvenOdd extends Frame implements ActionListener
{
	Label L1,L2,L3;
	TextField tf1,tf2;
	Button b1;
	CheckEvenOdd()
	{
		setLayout(null);
		Font f1=new Font("Times new roman",Font.BOLD,20);
		setFont(f1);
		setBackground(Color.pink);
		setForeground(Color.red);
		L1=new Label("*******Check EVEN ODD Number*******");
		L2=new Label("Enter Number:");
		L3=new Label("Result:");
		tf1=new TextField(30);
		tf2=new TextField(30);
		b1=new Button("Check Even/Odd");
		
		L1.setBounds(70,80,400,30);
		L2.setBounds(70,150,200,30);
		tf1.setBounds(280,150,150,30);
		L3.setBounds(70,200,200,30);
		tf2.setBounds(280,200,150,30);
		b1.setBounds(125,300,200,30);		
		add(L1);
		add(L2);add(tf1);
		add(L3);add(tf2);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int no=Integer.parseInt(tf1.getText());
		if(no%2==0)
		{
			tf2.setText("Even No");
		}
		else
		{
			tf2.setText("Odd No");
		}
	}
	public static void main(String args[])
	{
		CheckEvenOdd c1=new CheckEvenOdd();
		c1.setVisible(true);
		c1.setSize(500,400);
		c1.setTitle("EVEN ODD DEMO");
	}
}