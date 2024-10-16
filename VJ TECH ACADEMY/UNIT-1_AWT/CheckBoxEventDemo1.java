//Checkboxgroup
import java.awt.*;
import java.awt.event.*;
class CheckboxEventDemo extends Frame implements ItemListener
{
	CheckboxGroup cbg;
	Checkbox c1,c2,c3;
	Label L1;
	CheckboxEventDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		cbg=new CheckboxGroup();
		c1=new Checkbox("C Lang",false,cbg);
		c2=new Checkbox("C++ Lang",false,cbg);
		c3=new Checkbox("Java Lang",true,cbg);
		L1=new Label("                                                          ");
		add(c1);
		add(c2);
		add(c3);
		add(L1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox x=cbg.getSelectedCheckbox();
		if(x==c1)
		{
			L1.setText("You have selected C Lang");
		}
		else if(x==c2)
		{
			L1.setText("You have selected C++ Lang");
		}
		else
		{
			L1.setText("You have selected Java Lang");	
		}
	}
	public static void main(String args[])
	{
		CheckboxEventDemo f1=new CheckboxEventDemo();
		f1.setVisible(true);
		f1.setSize(500,400);
		f1.setTitle("Checkbox Demo");
	}
}