//Frame Class
import java.awt.*;
class FrameDemo1 extends Frame 
{
	FrameDemo1(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		FrameDemo1 f1=new FrameDemo1("VJTech Frame");
		f1.setVisible(true);
		f1.setSize(500,500);
		//f1.setTitle("My Frame");
	}
}
