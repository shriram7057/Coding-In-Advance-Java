import java.awt.*;
public class LabelDemo2 extends Frame
{
    LabelDemo2()
    {
    FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
    setLayout(f1);

        setBackground(Color.cyan);
        setForeground(Color.red);

        Label l1=new Label("Name");
        Label l2=new Label("Mumbai");
        Label l3=new Label();
        l3.setText("INDIA");
        l1.setBounds(100, 100, 100, 100);
        l2.setBounds(100,100,100,100);
        l3.setBounds(100,100,100,100);

        add(l1);
        add(l2);
        add(l3);
    }
    public static void main(String[] args) {
        LabelDemo2 ld2=new LabelDemo2();
        ld2.setVisible(true);
        ld2.setSize(500,500);
        ld2.setTitle("My Frame");
    }
}