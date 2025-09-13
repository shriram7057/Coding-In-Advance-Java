import javax.swing.*;
class OptionPaneExample4
{
    JFrameDemo f;
    OptionPaneExample4()
    {
        f=new JFrameDemo();
        String name=JOptionPane.showInputDialog(f,"What is your Name?") ;
   }
   public static void main(String[] args) 
   {
        new OptionPaneExample4(); 
   }
}