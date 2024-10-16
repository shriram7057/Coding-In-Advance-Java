import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements KeyListener 
{
    String keystate = "Hello SDL";
    String msg = "";
    MyFrame() 
    {
        addKeyListener(this);
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
    }

    public void keyPressed(KeyEvent ke) 
    {
        keystate = "Key Pressed";
        msg += ke.getKeyText(ke.getKeyCode());
        repaint();
    }

    public void keyTyped(KeyEvent ke) 
    {
        keystate = "Key Typed";
        repaint();
        msg = msg + ke.getKeyChar();
    }

    public void keyReleased(KeyEvent ke) 
    {
        keystate = "Key Released";
        repaint();
    }

    public void paint(Graphics g) 
    {
        g.drawString(keystate, 100, 50);
        g.drawString(msg, 100, 100);
    }
}

class KeyEventsExample 
{
    public static void main(String arg[]) 
    {
        MyFrame f = new MyFrame();
        f.setTitle("Key Events Example");
        f.setSize(500, 300);
        f.setVisible(true);
    }
}


