import javax.swing.*;
class JFrameDemo extends JFrame
{
  JFrameDemo()
  {

  }
  public static void main(String args[])
  {
    JFrameDemo j=new JFrameDemo();
    j.setVisible(true);
    j.setTitle("JFrameWindow");
    j.setSize(500, 500);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}