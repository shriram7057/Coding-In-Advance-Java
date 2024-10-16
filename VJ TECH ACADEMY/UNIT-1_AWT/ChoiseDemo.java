import java.awt.*;
class ChoiseDemo extends Frame
{
    ChoiseDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        setForeground(Color.RED);
        Choice c1=new Choice();
        c1.add("C Lang");
        c1.add("C++ Lang");
        c1.add("Java Lang");
        c1.add("Python Lang");
        add(c1);
    }
    public static void main(String[] args) {
        ChoiseDemo cd1=new ChoiseDemo();
        cd1.setVisible(true);
        cd1.setSize(500, 500);
        cd1.setTitle("Choise Controller!");
    }
}