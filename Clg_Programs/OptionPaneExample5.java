import javax.swing.*; 
import java.awt.event.*; 
public class OptionPaneExample5 extends WindowAdapter
{ 
    JFrame f; 
OptionPaneExample5()
{ 
    f=new JFrame(); 
    f.addWindowListener(this); 
    f.setSize(350, 350); 
    f.setLayout(null); 
    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
    f.setVisible(true); 
}
    public void windowClosing(WindowEvent e) 
{ 
    int a=JOptionPane.showConfirmDialog(f,"Hey, Are you sure?"); 
    if(a==JOptionPane.YES_OPTION)
{
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
} 
public static void main(String[] args) 
{ new OptionPaneExample5(); 
} 
}