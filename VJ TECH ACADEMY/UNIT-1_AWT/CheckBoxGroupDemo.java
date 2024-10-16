//Checkboxgroup
import java.awt.*;
class CheckboxgroupDemo extends Frame 
{
	CheckboxgroupDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox c1=new Checkbox("C Lang",false,cbg);
		Checkbox c2=new Checkbox("C++ Lang",false,cbg);
		Checkbox c3=new Checkbox("Java Lang",true,cbg);
		add(c1);
		add(c2);
		add(c3);
	}
	public static void main(String args[])
	{
		CheckboxgroupDemo f1=new CheckboxgroupDemo();
		f1.setVisible(true);
		f1.setSize(500,400);
		f1.setTitle("Checkbox Demo");
	}
}