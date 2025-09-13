import javax.swing.*; 
public class JListExample
{
     JListExample()
{ 
    JFrameDemo f= new JFrameDemo(); 
        DefaultListModel<String> l1 = new DefaultListModel<>(); 
        l1.addElement("Comp");
        l1.addElement("Chem"); 

        l1.addElement("Extc");
        l1.addElement("Poly"); 
        JList<String> list = new JList<>(l1); 

        list.setBounds(100,100, 75,75); 
        f.add(list);
        f.setSize(400,400);

        f.setLayout(null); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE); 
} 
public static void main(String args[]) 
{
     new JListExample(); 
}
} 