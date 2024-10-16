import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DemoExample extends Frame implements ActionListener {
    Label l3;

    DemoExample() {
        // FlowLayout f1=new FlowLayout();
        setLayout(null);
        setBackground(Color.CYAN);
        Label l1 = new Label("userName");
        l1.setBounds(30, 50, 90, 30);
        l1.setText("UserName:");
        add(l1);
        l1.setForeground(Color.BLACK);
        TextField t1 = new TextField();
        t1.setBounds(130, 50, 130, 30);
        t1.setText( "                                                                                                                                ");
        add(t1);
        //t1.addActionListener(this);
        Label l2 = new Label("Password");
        l2.setBounds(30, 90, 90, 30);
        l2.setText("Password:");
        add(l2);
        TextField t2 = new TextField();
        t2.setBounds(130, 90, 130, 30);
        add(t2);
        //t2.addActionListener(this);
        Button b1 = new Button("Login");
        b1.setBounds(150, 150, 70, 30);
        add(b1);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent a) {
        String str = a.getActionCommand();
        if (str.equals("Login")) {
            l3 = new Label("Login Successfully!");
            l3.setText("Login Successfully!");
            l3.setBounds(150, 200, 100, 30);
            add(l3);
        }
    }

    public static void main(String[] args) {
        DemoExample d = new DemoExample();
        d.setVisible(true);
        d.setTitle("Demo");
        d.setSize(500, 500);
    }
}