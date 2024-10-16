import java.awt.*; 
import java.awt.event.*;

import javax.swing.*; 
public class ActionListenerExample1
{
     public static void main(String[] args)
{ 
    JFrame f=new JFrame("ActionListener Example"); 
    final Component tf=new TextArea(); 
    tf.setBounds(50,50, 150,20); 
    Button b=new Button("Click Here");
    b.setBounds(50,100,60,30); 
    b.addActionListener(new ActionListener()
{ 
public void actionPerformed(ActionEvent e)
{ 
Toolkit.getDefaultToolkit().beep();
}
 
}); 
f.add(b);
f.add(tf); 
f.setSize(400,400);
 f.setLayout(null);
  f.setVisible(true); 
}
 }