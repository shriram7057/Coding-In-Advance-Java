import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//awt and swing components are same but the swing components look and feel are different

class ActionEventDemo2 extends Frame implements ActionListener {
    JButton b1, b2;
    JLabel l1;

    ActionEventDemo2() {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        b1 = new JButton("OK");
        b2 = new JButton("Cancle");
        l1 = new JLabel("                                              ");
        add(b1);
        add(b2);
        add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        // String str=ae.getActionCommand();The getActionCommand() method in Java is
        // used in the context of event
        // handling, specifically with ActionEvent
        if (ae.getSource() == b1)// The getSource() method in Java is used in event handling to identify the
                                 // source of an event
        {
            l1.setText("OK Button is Pressed!");
        } else {
            l1.setText("Cancle Button is Pressed!");

        }
    }

    public static void main(String[] args) {
        ActionEventDemo2 a = new ActionEventDemo2();
        a.setVisible(true);
        a.setTitle("ActionEvent Demo");
        a.setSize(400, 500);
    }
}