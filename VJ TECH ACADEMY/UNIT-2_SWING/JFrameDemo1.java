import java.awt.Frame;
import java.awt.Frame.*;
import javax.swing.*;
class JFrameDemo1 extends Frame
{
    JFrameDemo1(String title)
    {
        super(title);
    }
    public static void main(String args[])
    {
        JFrameDemo1 s1=new JFrameDemo1("FrameDemo");
        s1.setVisible(true);
        s1.setSize(500, 500);
    }
}