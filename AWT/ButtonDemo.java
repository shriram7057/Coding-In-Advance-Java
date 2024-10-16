import java.awt.*;
class ButtonDemo extends Frame
{
    ButtonDemo()
    {
        // java.awt.Container c=getContentPane();
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setBackground(Color.CYAN);
        Button b1=new Button("Submit");
        b1.setBounds(100,200,200,20);
        b1.setForeground(Color.RED);

        Font f1=new Font("Times New ROman",Font.BOLD,25);
        b1.setFont(f1);
        add(b1);

    }
    public static void main(String[] args) {
        new ButtonDemo();
    }
}