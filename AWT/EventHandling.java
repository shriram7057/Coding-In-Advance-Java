import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame implements ActionListener {
    TextField t;
    EventHandling(){
        t=new TextField();
        Button b=new Button("click");

        t.setBounds(60,50,170,20);
        b.setBounds(100,120,80,30);

        b.addActionListener(this); //register
        add(t);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        t.setText("Hello, Good Morning");
    } 

    public static void main(String[] args) {

        EventHandling e=new EventHandling();
    }
}
