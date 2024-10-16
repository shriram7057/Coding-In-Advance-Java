import java.awt.*;
import javax.swing.*;

class MenubarDemo extends JFrame 
{
    MenubarDemo() 
    {
        java.awt.Container c = getContentPane();
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mbr = new JMenuBar();

        JMenu m1 = new JMenu("File");

        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");
        JMenuItem mi4 = new JMenuItem("Save As");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        // Create the "Edit" menu
        JMenu m2 = new JMenu("Edit");

        JMenuItem mi5 = new JMenuItem("cut");
        JMenuItem mi6 = new JMenuItem("copy");
        JMenuItem mi7 = new JMenuItem("past");

        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi7);

        // Add "Edit" as a submenu to "File"
        m1.add(m2);

        // Add "File" menu to the menu bar
        mbr.add(m1);

        setJMenuBar(mbr);
        setVisible(true);
    }

    public static void main(String args[]) 
    {
        new MenubarDemo();
    }
}
