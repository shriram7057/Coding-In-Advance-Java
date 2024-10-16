import java.awt.*;
class ScrollbarDemo extends Frame
{
    ScrollbarDemo()
    {
        setBackground(Color.CYAN);
        setLayout(null);
        Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,200);
        Scrollbar sb2=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,200);

        sb1.setBounds(450,40,50,420);
        sb2.setBounds(10,450,420,50);

        sb1.setBackground(Color.YELLOW);
        sb2.setBackground(Color.YELLOW);
        add(sb1);
        add(sb2);
    }
    public static void main(String[] args)
    {
        ScrollbarDemo s1=new ScrollbarDemo();
        s1.setVisible(true);
        s1.setSize(500,500);
        s1.setTitle("Scrollbar");
    }
}