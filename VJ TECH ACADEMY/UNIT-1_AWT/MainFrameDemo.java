import java.awt.*;
class PanelDemo extends Panel
{
    PanelDemo()
    {
        setBackground(Color.CYAN);
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        Label l1=new Label("This is panel Window!!");
        Button b1=new Button("Panel");
        add(l1);
        add(b1);
        b1.setBackground(Color.RED);
    }
}
class MainFrameDemo extends Frame
{
    MainFrameDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        Label l1=new Label("This is Frame Window!!");
        Button b1=new Button("Frame");
        add(l1);
        add(b1);
        b1.setBackground(Color.RED);

        PanelDemo p1=new PanelDemo();
        add(p1);
    }
    public static void main(String args[])
    {
        MainFrameDemo m1=new MainFrameDemo();
        m1.setVisible(true);
        m1.setSize(500, 500);
        m1.setTitle("Panel Demo"); 
    }
}