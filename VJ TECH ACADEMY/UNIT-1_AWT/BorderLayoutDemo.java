import java.awt.*;
class BorderLayoutDemo extends Frame
{
    BorderLayoutDemo()
    {
        BorderLayout b1=new BorderLayout();
        setLayout(b1);
        Button b2=new Button("EAST");
        Button b3=new Button("WEST");
        Button b4=new Button("SOUTH");
        Button b5=new Button("NORTH");
        TextArea t1=new TextArea("This is Center Region!");
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.NORTH);
        add(t1,BorderLayout.CENTER);

    }
    public static void main(String args[])
    {
        BorderLayoutDemo b=new BorderLayoutDemo();
        b.setVisible(true);
        b.setSize(500,500);
        b.setTitle("BorderLayout");
    }
} 
