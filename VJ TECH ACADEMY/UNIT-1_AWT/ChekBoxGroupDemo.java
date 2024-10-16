import java.awt.*; 
class ChekBoxGroupDemo extends Frame 
{ 

     ChekBoxGroupDemo() 
 { 
  setBackground(Color.cyan); 
  setForeground(Color.black); 
   
     FlowLayout f1=new FlowLayout(); 
     setLayout(f1); 
   
     CheckboxGroup cbg=new CheckboxGroup();   
    Checkbox c1=new Checkbox("Male",true,cbg); 
    Checkbox c2=new Checkbox("female",false,cbg); 
    Checkbox c3=new Checkbox("Other",false,cbg); 

    add(c1); 
    add(c2); 
    add(c3); 
 } 
 public static void main(String args[]) 
 { 
   ChekBoxGroupDemo cbgd=new ChekBoxGroupDemo(); 
   
   cbgd.setVisible(true); 
   cbgd.setTitle("Chek Box Demo"); 
   cbgd.setSize(500,500); 
 } 
} 