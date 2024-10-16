import java.awt.*;
import java.awt.event.*;

class AwtElements extends Frame 
{
    AwtElements() 
    {
        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setTitle("AWT Elements!");
        setBackground(Color.CYAN);

        Font f1 = new Font("Times New Roman", Font.PLAIN, 13);

        // Label and TextField for Name
        Label l1 = new Label("Enter Your Name");
        l1.setBounds(20, 50, 110, 20);
        l1.setFont(f1);
        add(l1);

        TextField tf1 = new TextField("");
        tf1.setBounds(150, 50, 150, 20);
        add(tf1);

        // Checkboxes for Subject Selection
        Checkbox c1 = new Checkbox("AJP", null, true);
        Checkbox c2 = new Checkbox("JSP", null, false);
        Checkbox c3 = new Checkbox("CNS", null, false);
        c1.setBounds(50, 120, 50, 50);
        c2.setBounds(100, 120, 50, 50);
        c3.setBounds(150, 120, 50, 50);
        add(c1);
        add(c2);
        add(c3);

        // Radio Buttons for Gender Selection
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c4 = new Checkbox("Male", cbg, false);
        Checkbox c5 = new Checkbox("Female", cbg, true);
        c4.setBounds(150, 200, 60, 20);
        c5.setBounds(220, 200, 80, 20);
        add(c4);
        add(c5);

        // List for Course Selection
        List l = new List(3, true);
        l.add("CS");
        l.add("IT");
        l.add("CHEM");
        l.setBounds(150, 250, 100, 50);
        add(l);

        // Choice Dropdown for Subjects
        Choice choice = new Choice();
        choice.add("AJP");
        choice.add("JSP");
        choice.add("CNS");
        choice.setBounds(150, 320, 100, 20);  // Added setBounds to position it
        add(choice);

        // TextArea for additional input
        TextArea t1 = new TextArea();
        t1.setBounds(150, 350, 200, 100);
        add(t1);

        // Submit Button
        Button b1 = new Button("Submit");
        b1.setBounds(150, 470, 70, 30);
        add(b1);

        // Adding MenuBar with File Menu
        MenuBar mbr = new MenuBar();
        setMenuBar(mbr);

        Menu file = new Menu("File");
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        file.add(new MenuItem("Save"));
        file.add(new MenuItem("Exit"));
        mbr.add(file);
    }

    public static void main(String[] args) 
    {
        new AwtElements();
    }
}
