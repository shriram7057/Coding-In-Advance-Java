import java.awt.*;
public class CheckBoxDemo extends Frame 
{
    CheckBoxDemo()
    {
        setBackground(Color.CYAN);
        setForeground(Color.RED);
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        Checkbox c1=new Checkbox("India",true); 
        Checkbox c2=new Checkbox("America"); 
        Checkbox c3=new Checkbox("Awasari"); 
         
        add(c1); 
        add(c2); 
        add(c3);
    }

    public static void main(String[] args) 
    {
        CheckBoxDemo cbd=new CheckBoxDemo();
        cbd.setVisible(true);
        cbd.setSize(300,300);
        cbd.setTitle("ChechBox");
    }
}