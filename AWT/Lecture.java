import java.awt.*;
class Lecture extends Frame 
{
    Lecture()
    {
        Button b1=new Button("click me");
        add(b1);
        b1.setBounds(50,100,90,30);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
        setTitle("First program");
    }

    public static void main(String[] args) 
    {
        Lecture l=new Lecture();
    }
}
