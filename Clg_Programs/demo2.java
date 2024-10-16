import java.awt.*;
class demo2 extends Frame{
    public void paint(Graphics g)
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        g.drawString("shriram",150,150);
    }
    public static void main(String[] args) {
        demo2 d2=new demo2();
        d2.setVisible(true);
        d2.setTitle("my frame");
        d2.setSize(500,500);
    }
}