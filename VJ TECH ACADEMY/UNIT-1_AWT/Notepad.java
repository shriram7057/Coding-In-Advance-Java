import java.awt.*;
import javax.swing.*;
class Notepad extends Frame
{
    Notepad()
    {
        setBackground(Color.CYAN);
        MenuBar mbr=new MenuBar();

        Menu m1=new Menu("File");
        MenuItem mi1=new MenuItem("New");
        MenuItem mi2=new MenuItem("open");
        MenuItem mi3=new MenuItem("Save");
        MenuItem mi4=new MenuItem("Save As");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        Menu m2=new Menu("Edit");

        MenuItem mi5=new MenuItem("cut");
        MenuItem mi6=new MenuItem("copy");
        MenuItem mi7=new MenuItem("past");
        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi7);

        Menu m3=new Menu("Search");

        MenuItem mi8=new MenuItem("Find");
        MenuItem mi9=new MenuItem("Replace");
        MenuItem mi10=new MenuItem("Mark");
        m3.add(mi8);
        m3.add(mi9);
        m3.add(mi10);

        Menu m4=new Menu("View");

        MenuItem mi11=new MenuItem("Zoom");
        MenuItem mi12=new MenuItem("Tab");
        MenuItem mi13=new MenuItem("Fold All");
        m4.add(mi11);
        m4.add(mi12);
        m4.add(mi13);

        mbr.add(m1);
        mbr.add(m2);
        mbr.add(m3);
        mbr.add(m4);

        setMenuBar(mbr);
    }
    public static void main(String[] args) 
    {
        Notepad n1=new Notepad();
        n1.setVisible(true);
        n1.setTitle("Notepad");
        n1.setSize(500, 500);
    }
}