//Notepad in Java
import java.awt.*;
import java.awt.event.*;
class Notepad extends Frame implements ActionListener
{
	MenuItem m12,m13;
	Notepad()
	{
		setBackground(Color.pink);
		
		MenuBar mbr=new MenuBar();
		
		Menu m1=new Menu("File");
		MenuItem m11=new MenuItem("New");
		m12=new MenuItem("Open");	
		m13=new MenuItem("Save");
		MenuItem m14=new MenuItem("Save As");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		
		Menu m2=new Menu("Edit");
		MenuItem m21=new MenuItem("Undo");
		MenuItem m22=new MenuItem("Cut");
		MenuItem m23=new MenuItem("Copy");
		MenuItem m24=new MenuItem("Paste");
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		
		Menu m3=new Menu("Search");
		MenuItem m31=new MenuItem("Find");
		MenuItem m32=new MenuItem("Find in File");
		MenuItem m33=new MenuItem("Find Next");
		MenuItem m34=new MenuItem("Find Previous");
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m3.add(m34);
		
		Menu m4=new Menu("View");
		Menu m41=new Menu("Zoom");
		MenuItem m411=new MenuItem("Zoom In");
		MenuItem m412=new MenuItem("Zoom Out");
		m41.add(m411);
		m41.add(m412);
		
		CheckboxMenuItem m42=new CheckboxMenuItem("Word Wrap");
		MenuItem m43=new MenuItem("Tab");
		MenuItem m44=new MenuItem("Fold All");
		m4.add(m41);
		m4.add(m42);
		m4.add(m43);
		m4.add(m44);
		
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		mbr.add(m4);
		
		setMenuBar(mbr);
		m12.addActionListener(this);
		m13.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m12)
		{
			FileDialog fd=new FileDialog(this,"Open",FileDialog.LOAD);
			fd.setVisible(true);
		}
		if(ae.getSource()==m13)
		{
			FileDialog fd=new FileDialog(this,"Save",FileDialog.SAVE);
			fd.setVisible(true);
		}
	
	}
	public static void main(String args[])
	{
		Notepad n1=new Notepad();
		n1.setVisible(true);
		n1.setTitle("Notepad");
		n1.setSize(500,500);
	}
}