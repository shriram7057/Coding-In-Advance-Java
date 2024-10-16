//Applet Program
import java.applet.*;
import java.awt.*;
public class AppletDemo extends Applet 
{
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to World of Applet",150,150);
	}
}
/*
<applet code="AppletDemo.class" width="500" height="500">
</applet>
*/