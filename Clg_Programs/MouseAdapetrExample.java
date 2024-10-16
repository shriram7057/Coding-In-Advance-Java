import java.awt.*;
import java.awt.event.*;
public class MouseAdapetrExample
{
    Frame f;
    MouseAdapetrExample()
    {
        f=new Frame("Mouse Adapter");
        f.addMouseListener((MouseListener) this);

        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void mauseClicked(MouseEvent e)
    {
        Graphics g=f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public static void main(String[] args) {
        new MouseAdapetrExample();
    }
} 