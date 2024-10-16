//JTabbedPane class
import java.awt.*;
import javax.swing.*;
class JPanel1 extends JPanel 
{
	JPanel1()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		JButton b1=new JButton("OK");
		JButton b2=new JButton("CANCEL");
		JButton b3=new JButton("RETRY");
		add(b1);
		add(b2);
		add(b3);
	}
}
class JPanel2 extends JPanel 
{
	JPanel2()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		JButton b1=new JButton("INDIA");
		JButton b2=new JButton("US");
		JButton b3=new JButton("UK");
		add(b1);
		add(b2);
		add(b3);
	}
}
class JPanel3 extends JPanel 
{
	JPanel3()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		JButton b1=new JButton("PUNE");
		JButton b2=new JButton("SOLAPUR");
		JButton b3=new JButton("MIRJAPUR");
		add(b1);
		add(b2);
		add(b3);
	}
}
class JTabbedPaneDemo extends JFrame 
{
	JTabbedPaneDemo()
	{
		java.awt.Container c=getContentPane();
		JTabbedPane jtp=new JTabbedPane();
		JPanel1 jp1=new JPanel1();
		JPanel2 jp2=new JPanel2();
		JPanel3 jp3=new JPanel3();
		jtp.addTab("TAB1",jp1);
		jtp.addTab("TAB2",jp2);
		jtp.addTab("TAB3",jp3);
		c.add(jtp);
	}
	public static void main(String args[])
	{
		JTabbedPaneDemo f1=new JTabbedPaneDemo();
		f1.setVisible(true);
		f1.setTitle("VJTech Frame");
		f1.setSize(500,500);
	}
}