import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class ColorDemo extends Frame implements ActionListener
{
    Button b1=new Button();
    Button b2=new Button();
    Button b3=new Button();
    ColorDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        b1=new Button("Cyan");
        b2=new Button("Red");
        b3=new Button("GRAY");

        add(b1);
        add(b2);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(b1==ae.getSource())
        {
            setBackground(Color.CYAN);
        }
        else if(b2==ae.getSource())
        {
            setBackground(Color.RED);
        }
        else
        {
            setBackground(Color.GRAY);
        }
    }
    public static void main(String[] args) 
    {
        ColorDemo cd1=new ColorDemo();
        cd1.setVisible(true);
        cd1.setTitle("Color Frame");
        cd1.setSize(500, 500);
    }
}
