//TextField Class programs
import java.awt.*;
class TextFieldDemo extends Frame
{
	TextFieldDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.CYAN);
		Label L1=new Label("Enter User Name:");
		Label L2=new Label("Enter Password:");
		TextField tf1=new TextField("VJTech",30);
		TextField tf2=new TextField(30);
		Button b1=new Button("Login");
		tf2.setEchoChar('*');
		add(L1);add(tf1);
		add(L2);add(tf2);
		add(b1);
	}
	public static void main(String args[])
	{
		TextFieldDemo f1=new TextFieldDemo();
		f1.setVisible(true);
		f1.setTitle("My Frame");
		f1.setSize(500,500);
	}
}