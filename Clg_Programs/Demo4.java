import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Demo4 extends Frame implements ActionListener {
    Button b1;
    Label l4;

    Demo4() {
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        // Creating Layout
        setLayout(null);
        setVisible(true);
        setTitle("Form Example");
        setSize(700, 700);

        // Creating labels and text fields
        Label l = new Label("Name");
        l.setBounds(50, 100, 90, 30);
        add(l);

        TextField T = new TextField();
        T.setBounds(160, 100, 150, 30);
        T.setText("Shriram Lahane");
        add(T);

        Label l1 = new Label("Department");
        l1.setBounds(50, 150, 90, 30);
        add(l1);

        TextField T1 = new TextField();
        T1.setBounds(160, 150, 150, 30);
        T1.setText("Computer Engineering");
        add(T1);

        Label l2 = new Label("PRN");
        l2.setBounds(50, 200, 90, 30);
        add(l2);

        TextField T2 = new TextField();
        T2.setBounds(160, 200, 150, 30);
        T2.setText("2230403245062");
        add(T2);

        // Creating gender selection
        Label l3 = new Label("GENDER");
        l3.setBounds(50, 250, 90, 30);
        add(l3);

        CheckboxGroup CBG = new CheckboxGroup();
        Checkbox C4 = new Checkbox("male", CBG, true);
        Checkbox C5 = new Checkbox("female", CBG, false);
        C4.setBounds(150, 240, 50, 50);
        C5.setBounds(205, 240, 55, 50);
        add(C4);
        add(C5);

        // Creating team selection
        Label l4 = new Label("Team");
        l4.setBounds(50, 300, 90, 30);
        add(l4);

        Checkbox C1 = new Checkbox("tech", null, true);
        Checkbox C2 = new Checkbox("non tech", null, false);
        Checkbox C3 = new Checkbox("none", null, false);
        C1.setBounds(150, 290, 50, 50);
        C2.setBounds(250, 290, 65, 50);
        C3.setBounds(350, 290, 50, 50);
        add(C1);
        add(C2);
        add(C3);

        // Creating subject selection
        Label l5 = new Label("SUBJECT");
        l5.setBounds(50, 350, 90, 30);
        add(l5);

        List L1 = new List(5, true);
        L1.add("AJP");
        L1.add("CNS");
        L1.add("JSP");
        L1.add("OS");
        L1.add("ED");
        L1.setBounds(150, 350, 100, 80);
        add(L1);

        // Creating department description
        Label l6 = new Label("ABOUT DEPARTMENT");
        l6.setBounds(50, 450, 150, 30);
        add(l6);

        TextArea TA = new TextArea();
        TA.setBounds(200, 450, 200, 100);
        add(TA);

        // Creating submit button
        b1 = new Button("SUBMIT THE FORM");
        b1.setBounds(250, 600, 130, 30);
        b1.setBackground(Color.RED);
        add(b1);

        // Adding label to show submission status
        l4 = new Label(" ");
        l4.setBounds(50, 650, 300, 30);
        add(l4);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("SUBMIT THE FORM")) {
            l4.setText("Form submitted successfully!");
        }
    }

    public static void main(String[] args) {
        Demo4 d1 = new Demo4();
    }
}
