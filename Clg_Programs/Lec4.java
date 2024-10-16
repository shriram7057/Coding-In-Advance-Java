import java.awt.*;

public class Lec4 extends Frame {
    Lec4() {
        // Seting Frames layout
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setTitle("UI element program");

        // Creating Label
        Label l = new Label("AJP");
        l.setBounds(50, 100, 90, 30);
        l.setText("AJP Lecture");
        add(l);

        // Creating text field
        TextField t = new TextField();
        t.setBounds(160, 100, 90, 30);
        t.setText("Hello");
        add(t);

        // Creating Text box
        Checkbox C1 = new Checkbox("AJP", null, true);
        Checkbox C2 = new Checkbox("JSP", null, false);
        Checkbox C3 = new Checkbox("CNS", null, false);
        C1.setBounds(50, 160, 50, 50);
        C2.setBounds(150, 160, 50, 50);
        C3.setBounds(250, 160, 50, 50);
        add(C1);
        add(C2);
        add(C3);

        // Creating Radio buttons
        CheckboxGroup CBG = new CheckboxGroup();
        Checkbox C4 = new Checkbox("Male", CBG, false);
        Checkbox C5 = new Checkbox("Female", CBG, false);
        C4.setBounds(50, 250, 50, 50);
        C5.setBounds(150, 250, 80, 50);
        add(C4);
        add(C5);

        // Creating List
        List L1 = new List(3, true);
        L1.add("CS");
        L1.add("IT");
        L1.add("CHEM");
        L1.add("EXTC");
        L1.setBounds(50, 350, 100, 80);
        add(L1);

        // Creating Choice
        Choice C = new Choice();
        C.add("AJP");
        C.add("JSP");
        C.add("CNS");
        C.setBounds(50, 500, 50, 50);
        add(C);

        // Creating Text Area
        TextArea TA = new TextArea();
        TA.setBounds(200, 350, 100, 100);
        add(TA);

        // Creating Menu Bar
        MenuBar MBar = new MenuBar();
        setMenuBar(MBar);
        Menu File = new Menu("File");
        MenuItem I1, I2;
        File.add(new MenuItem("New"));
        File.add(new MenuItem("Open"));
        MBar.add(File);
    }

    public static void main(String[] args) {
        Lec4 L4 = new Lec4();

    }
}