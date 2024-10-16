import java.awt.*; 
class LabelDemo extends Frame 
{ 
  LabelDemo() 
  { 
     setLayout(null); 
 setBackground(Color.cyan); 
 setForeground(Color.red); 
  
 Label L1=new Label("India"); 
 Label L2=new Label("Pune"); 
 Label L3=new Label(); 
 L3.setText("Mumbai"); 
 
 L1.setBounds(100,100,110,60); 
 L2.setBounds(100,180,110,60); 
 L3.setBounds(100,260,110,60); 
 add(L1); 
 add(L2); 
 add(L3); 
  } 
  public static void main(String args[]) 
  { 
    LabelDemo id=new LabelDemo(); 
 id.setVisible(true); 
 id.setTitle("Karan Mohite"); 
 id.setSize(500,500); 
  } 
} 