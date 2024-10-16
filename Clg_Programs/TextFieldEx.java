import java.awt.*;
class TextFieldEx extends Frame
{
    TextFieldEx()
    {
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        TextField t1=new TextField();
        add(t1);
    }
    public static void main(String[] args) {
        TextFieldEx t=new TextFieldEx();
        t.setVisible(true);
        t.setSize(500,500);
        t.setTitle("textField");
    }
}