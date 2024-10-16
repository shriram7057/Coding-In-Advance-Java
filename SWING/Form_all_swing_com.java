import javax.swing.*;
import java.awt.*;

class FormAllSwingComponents extends JFrame {

    FormAllSwingComponents() 
    {                                         // JFrame all Methods
        setLayout(null);
        setSize(600, 600);
        setTitle("Swing Elements!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        java.awt.Container c = getContentPane();
        c.setBackground(Color.YELLOW);

        Font f1 = new Font("Times New Roman", Font.BOLD, 13);

        // Label and TextField for Name
        JLabel l1 = new JLabel("Enter Your Name");
        l1.setBounds(20, 50, 110, 20);
        l1.setFont(f1);
        c.add(l1);

        JTextField tf1 = new JTextField("");
        tf1.setBounds(150, 50, 150, 20);
        c.add(tf1);

        // Checkboxes for Subject Selection
        JCheckBox cb1 = new JCheckBox("AJP", true);
        JCheckBox cb2 = new JCheckBox("JSP", false);
        JCheckBox cb3 = new JCheckBox("CNS", false);
        cb1.setBounds(50, 120, 60, 20);
        cb2.setBounds(120, 120, 60, 20);
        cb3.setBounds(190, 120, 60, 20);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);

        // Radio Buttons for Gender Selection
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton Male = new JRadioButton("Male", true);
        JRadioButton Female = new JRadioButton("Female", false);
        Male.setBounds(150, 200, 80, 20);
        Female.setBounds(240, 200, 80, 20);
        genderGroup.add(Male);
        genderGroup.add(Female);
        c.add(Male);
        c.add(Female);

        // List for Course Selection
        String[] courses = {"CS", "IT", "CHEM"};
        JList<String> courseList = new JList<>(courses);
        courseList.setBounds(150, 240, 100, 60); 
        c.add(courseList);

        JComboBox<String> jcb = new JComboBox<>(new String[] {"AJP", "JSP", "CNS"});
        jcb.setBounds(150, 320, 100, 20);
        jcb.setSelectedIndex(2);   //set Selected Method
        c.add(jcb);

        JTextArea t1 = new JTextArea();
        t1.setBounds(150, 350, 200, 100);
        t1.setLineWrap(true);   //setLineWrap Method
        c.add(t1);

        JButton b1 = new JButton("Submit");
        b1.setBounds(150, 470, 100, 30);
        b1.setFont(f1);
        b1.setForeground(Color.RED);
        c.add(b1);

        JMenuBar mbr = new JMenuBar();
        setJMenuBar(mbr);

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Exit"));
        mbr.add(fileMenu);

        setVisible(true);
    }

    public static void main(String args[]) {
        new FormAllSwingComponents();
    }
}
