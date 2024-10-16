//Window Closing Program
import java.awt.*;
import java.awt.event.*;
class WindowCloseDemo extends Frame implements WindowListener
{
	WindowCloseDemo()
	{
		addWindowListener(this);
	}	
	public void windowClosing(WindowEvent we)
	{
		dispose();
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public static void main(String args[])
	{
		WindowCloseDemo n1=new WindowCloseDemo();
		n1.setVisible(true);
		n1.setTitle("WindowCloseDemo");
		n1.setSize(500,500);
	}
}
