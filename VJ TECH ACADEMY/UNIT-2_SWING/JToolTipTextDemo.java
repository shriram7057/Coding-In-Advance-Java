import java.awt.*;
import javax.swing.*;
class JToolTipTextDemo extends JFrameDemo
{
    JToolTipTextDemo()
    {
        java.awt.Container c=getContentPane();
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        JButton b1=new JButton("Submit");
        b1.setToolTipText("Submit all data");
		c.add(b1);
    }
    public static void main(String[] args) {
        JToolTipTextDemo jt=new JToolTipTextDemo();
        jt.setVisible(true);
        jt.setSize(500,500);
        jt.setTitle("JTollTipFrame");
    }
}