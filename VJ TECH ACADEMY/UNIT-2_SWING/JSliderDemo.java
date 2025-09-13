import java.awt.*;
import javax.swing.*;
class JSliderDemo extends JFrameDemo
{
    JSliderDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        java.awt.Container c=getContentPane();
        JSlider j=new JSlider(JSlider.HORIZONTAL,0,200,40);//By Default Horizontal
        c.add(j);
    }
    public static void main(String args[])
    {
        JSliderDemo js=new JSliderDemo();
        js.setVisible(true);
        js.setTitle("Slider");
        js.setSize(500,500);
    }
}