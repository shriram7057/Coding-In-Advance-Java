import java.awt.*;
import java.awt.event.*;
class ActionEventDemo extends Frame implements ActionListener
{
    Button b1,b2;
    Label l1;
    ActionEventDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        b1=new Button("OK");
        b2=new Button("CANCLE");
        l1=new Label("                                                                                ");     
        add(b1);
        add(b2);
        add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();//this method associated with action event when event is occured!and determine the action was triggered!
        if(str.equals("OK"))
        {
        l1.setText("Ok Button Is Pressed!");
        }
        else
        {
        l1.setText("Cancle Button is pressed");
        }
    }
    public static void main(String[] args) {
        ActionEventDemo a=new ActionEventDemo();
        a.setVisible(true);
        a.setTitle("ActionEventFrame");
        a.setSize(500,500);
    }
}