import javax.swing.*; 
public class ButtonExample 
{
     public static void main(String[] args) 
{
     JFrameDemo f=new JFrameDemo("Button Example"); 
        JButton b=new JButton("Click Here"); 
        b.setBounds(50,100,95,30); 
        f.add(b); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
} 
}