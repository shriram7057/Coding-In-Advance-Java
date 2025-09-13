import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.constantpool.IntegerEntry;
class Claculator_Demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    Claculator_Demo()
{
    setLayout(null);
    setVisible(true);
    setSize(500,500);

    l1=new Label("Num1");
    l2=new Label("Num2");
    l3=new Label("Resut");

     t1=new TextField();
     t2=new TextField();
     t3=new TextField();

     b1=new Button("ADD");
     b2=new Button("SUB");
     b3=new Button("MUL");
     b4=new Button("DIV");

        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);

        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);

        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(230,250,50,20);

    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);
    add(b3);
    add(b4);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    int Num1=Integer.parseInt(t1.getText());
    int Num2=Integer.parseInt(t2.getText());
    if(e.getSource()==b1)
    {
        t3.setText(String.valueOf(Num1+Num2));
    }
    if(e.getSource()==b2)
    {
        t3.setText(String.valueOf(Num1-Num2));
    }
    if(e.getSource()==b3)
    {
        t3.setText(String.valueOf(Num1*Num2));
    }
    if(e.getSource()==b4)
    {
        t3.setText(String.valueOf(Num1/Num2));
    }
}
    public static void main(String[] args) {
        new Claculator_Demo();
    }
}