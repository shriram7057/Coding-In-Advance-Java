//Class: KeyEvent & Interface: KeyListener 
import java.awt.*;
import java.awt.event.*;
class KeyEventDemo extends Frame implements KeyListener
{
	KeyEventDemo()
	{
		setLayout(new FlowLayout());
		TextField tf1=new TextField(40);
		add(tf1);
		tf1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("Key Pressed...!!!");
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("Key keyTyped...!!!");
	}
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("Key keyReleased...!!!");
	}
	public static void main(String args[])
	{
		KeyEventDemo f1=new KeyEventDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("VJTech Frame");
	}
}
