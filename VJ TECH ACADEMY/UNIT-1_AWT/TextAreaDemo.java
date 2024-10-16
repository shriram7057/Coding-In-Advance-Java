import java.awt.*;
class TextAreaDemo extends Frame
{
    TextAreaDemo()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        setBackground(Color.CYAN);
        setForeground((Color.RED));
        TextArea ta1=new TextArea("Write Your Feedback Here",25,50,TextArea.SCROLLBARS_BOTH);
        add (ta1);
    }      
    public static void main(String args[])
    {
        TextAreaDemo c1=new TextAreaDemo();
        c1.setSize(500,500);
        c1.setTitle("TextAreaDemo");
        c1.setVisible(true);
    }
}