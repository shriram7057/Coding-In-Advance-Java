//Calculator in java
//void setBounds(int x,int y,int width,int height);
import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener 
{
	Label L1,L2,L3,L4;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4;
	Calculator()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
		Font f1=new Font("Arial Black",Font.BOLD,20);
		setFont(f1);
		L1=new Label("VJTECH CALCULATOR",Label.CENTER);
		L2=new Label("Enter 1st Number:");
		L3=new Label("Enter 2nd Number:");
		L4=new Label("Result:");
		
		tf1=new TextField(30);
		tf2=new TextField(30);
		tf3=new TextField(30);
		
		b1=new Button("ADD");
		b2=new Button("SUB");
		b3=new Button("MUL");
		b4=new Button("DIV");
		
		L1.setBounds(50,80,400,30);
		L2.setBounds(40,150,200,30);
		tf1.setBounds(250,150,180,30);
		L3.setBounds(40,230,200,30);
		tf2.setBounds(250,230,180,30);
		L4.setBounds(40,310,200,30);
		tf3.setBounds(250,310,180,30);
		b1.setBounds(40,410,100,40);
		b2.setBounds(170,410,100,40);
		b3.setBounds(300,410,100,40);
		b4.setBounds(430,410,100,40);
		
		add(L1);
		add(L2);add(tf1);
		add(L3);add(tf2);
		add(L4);add(tf3);
		add(b1);add(b2);add(b3);add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c;
		if(b1==ae.getSource())
		{
			c=a+b;
			tf3.setText(c+"");
		}
		else if(b2==ae.getSource())
		{
			c=a-b;
			tf3.setText(c+"");			
		}
		else if(b3==ae.getSource())
		{
			c=a*b;
			tf3.setText(c+"");			
		}
		else if(b4==ae.getSource())
		{
			float d=(float)a/b;
			tf3.setText(d+"");			
		}
	}
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		c1.setVisible(true);
		c1.setTitle("Calculator");
		c1.setSize(550,500);
	}
}