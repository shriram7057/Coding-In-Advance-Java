//Student Registration form
import java.awt.*;
import java.awt.event.*;
class StudentRegDemo extends Frame implements ActionListener
{
	Label L7;
	StudentRegDemo()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
		Label L=new Label("STUDENT REGISTRATION FORM");
		Label L1=new Label("Enter Full Name:");
		Label L2=new Label("Enter Mobile No:");
		Label L3=new Label("Enter Address:");
		Label L4=new Label("Enter Email ID:");
		Label L5=new Label("Enter City Name:");
		Label L6=new Label("Enter DOB:");
		L7=new Label("                       ");
		TextField tf1=new TextField(30);
		TextField tf2=new TextField(30);
		TextField tf3=new TextField(30);
		TextField tf4=new TextField(30);
		TextField tf5=new TextField(30);
		TextField tf6=new TextField(30);	
		Button b1=new Button("Submit");
		L.setBounds(150,50,300,50);
		L1.setBounds(50,130,150,30);
		tf1.setBounds(220,130,200,30);
		
		L2.setBounds(50,180,150,30);
		tf2.setBounds(220,180,200,30);
		
		L3.setBounds(50,230,150,30);
		tf3.setBounds(220,230,200,30);
		
		L4.setBounds(50,280,150,30);
		tf4.setBounds(220,280,200,30);
		
		L5.setBounds(50,330,150,30);
		tf5.setBounds(220,330,200,30);
		
		L6.setBounds(50,380,150,30);
		tf6.setBounds(220,380,200,30);
		
		b1.setBounds(180,450,150,30);
		
		L7.setBounds(180,500,200,30);
		
		add(L);
		add(L1);add(tf1);
		add(L2);add(tf2);
		add(L3);add(tf3);
		add(L4);add(tf4);
		add(L5);add(tf5);
		add(L6);add(tf6);
		add(b1);add(L7);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		L7.setText("Records Submitted Successfully");
	}
	public static void main(String args[])
	{
		StudentRegDemo s1=new StudentRegDemo();
		s1.setVisible(true);
		s1.setTitle("Student Registration Form");
		s1.setSize(500,600);
	}
}