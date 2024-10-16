import java.awt.*;
public class FrameExample extends Frame{
    public void paint(Graphics g)
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        g.drawString("this is My Frame ",300,300);
    }
    public static void main(String[] args) {
        FrameExample f1=new FrameExample();
        
            f1.setVisible(true);
            f1.setTitle("Shriram Frame");
            f1.setSize(300,300);
        }
    

}