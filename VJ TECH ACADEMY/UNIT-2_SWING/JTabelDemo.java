//JTable Class
import javax.swing.*;
import java.awt.*;
class JTableDemo extends JFrame
{
	JTableDemo()
	{
		java.awt.Container c=getContentPane();
		String colhead[]={"ROLL NO","NAME","MARKS"};
		String data[][]={{"1010","Dennis","98.50"},
						 {"2020","Bjarne","45.50"},
						 {"3030","James","90.91"},
						 {"4040","Peter","80.80"},
						 {"5050","Yang","30.45"}
						};
		JTable jt=new JTable(data,colhead);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jt,v,h);
		c.add(jsp);
	}
	public static void main(String args[])
	{
		JTableDemo f1=new JTableDemo();
		f1.setVisible(true);
		f1.setTitle("VJTech Frame");
		f1.setSize(500,500);
	}
}