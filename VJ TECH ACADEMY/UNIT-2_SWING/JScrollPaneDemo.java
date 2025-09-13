import java.awt.*;
import javax.swing.*;
class JScrollPaneDemo extends JFrameDemo
{
    JScrollPaneDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
       java.awt. Container c= getContentPane();
        JTextArea jt=new JTextArea(30,30);
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp=new JScrollPane(jt,v,h);
    }
    public static void main(String args[])
    {
        JScrollPaneDemo f1=new JScrollPaneDemo();
		f1.setVisible(true);
		f1.setTitle("VJTech Frame");
		f1.setSize(500,500);

    }
}