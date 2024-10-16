import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
class ItemEventDemo extends Frame implements ItemListener
{
    JLabel l1;
    Checkbox c1;
    ItemEventDemo()
    {
        FlowLayout f1=new FlowLayout();  
        setLayout(f1); 
        c1=new Checkbox("OK");
        l1=new JLabel("                                                                          "); 
        add(c1);   
        add(l1);
        c1.addItemListener(this); 
    }
    public void itemStateChanged(ItemEvent ie)
    {
        l1.setText("You have selected OK CheckBox");
    }
    public static void main(String[] args) {
        ItemEventDemo i=new ItemEventDemo();
        i.setVisible(true);
        i.setTitle("ItemEventFrame");
        i.setSize(500,500);
    }
  
}