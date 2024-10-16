//class:MouseEvent & Listener: MouseListener
import java.awt.*;
import java.awt.event.*;
class MouseEventDemo extends Frame	implements MouseListener,MouseMotionListener
{
	MouseEventDemo()
	{
		setLayout(new FlowLayout());
		TextField tf1=new TextField(30);
		add(tf1);
		tf1.addMouseListener(this);
		tf1.addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse Entered Event Occurred...!!!");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse Exited Event Occurred...!!!");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released Event Occurred...!!!");
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse Pressed Event Occurred...!!!");
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked Event Occurred...!!!");
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged Event Occurred...!!!");
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("Mouse Moved Event Occurred...!!!");
	}
	public static void main(String args[])
	{
		MouseEventDemo m1=new MouseEventDemo();
		m1.setVisible(true);
		m1.setSize(500,500);
		m1.setTitle("VJTech Frame");
	}
}


