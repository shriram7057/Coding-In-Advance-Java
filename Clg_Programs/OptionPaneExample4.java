import javax.swing.*;
class OptionPaneExample4
{
    JFrame f;
    OptionPaneExample4()
    {
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"What is your Name?") ;
   }
   public static void main(String[] args) 
   {
        new OptionPaneExample4(); 
   }
}