import java.awt.*;
import java.awt.event.*;
public class BasicCal extends Frame implements ActionListener{
    Label l1=new Label("Num1");
    Label l2=new Label("Num2");
    Label l3=new Label("Result");

    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();

    Button b1=new Button("Add");
    Button b2=new Button("Sub");
    Button b3=new Button("Mul");
    Button b4=new Button("Div");
    Button b5=new Button("Exit");

    BasicCal(){
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
        b5.setBounds(290,250,50,20);

        add(l1);add(l2);add(l3);add(b1);add(b2);add(b3);
        add(t1);add(t2);add(t3);add(b4);add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setSize(400,500);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        if(e.getSource()==b1){
            t3.setText(String.valueOf(num1+num2));
        }
        if(e.getSource()==b2){
            t3.setText(String.valueOf(num1-num2));
        }
        if(e.getSource()==b3){
            t3.setText(String.valueOf(num1*num2));
        }
        if(e.getSource()==b4){
            t3.setText(String.valueOf(num1/num2));
        }
        if(e.getSource()==b5){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        BasicCal bs=new BasicCal();
    }

}
