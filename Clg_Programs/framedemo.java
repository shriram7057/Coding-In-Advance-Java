import java.awt.*;
class Framedemo extends Frame
{
	Framedemo(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		Framedemo f1= new Framedemo("Shriram Frame");
		f1.setVisible(true);
		//f1.setTitle("Shriram Frame");
		f1.setSize(500,500);
	}
}