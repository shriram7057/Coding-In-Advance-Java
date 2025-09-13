import javax.swing.*; 
public class ImageOnButtonExample 
{ 
    ImageOnButtonExample()
{ 
    JFrameDemo f=new JFrameDemo("Image on Button Example"); 
    JButton b=new JButton(new ImageIcon("Ai.jpg")); 
    b.setBounds(100,100,350,100); 
    f.add(b);
    f.setSize(600,400); 
    f.setLayout(null);
    f.setVisible(true); 
    f.setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE); 
} 
public static void main(String[] args) 
{ 
    new ImageOnButtonExample(); 
} 
}