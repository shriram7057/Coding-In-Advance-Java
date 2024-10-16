import java.awt.*;
import java.awt.event.*;
class TextEventDemo extends Frame implements TextListener
{
    Label l1;
    TextEventDemo()
{
    FlowLayout f1=new FlowLayout();
    setLayout(f1);
   // Label l1=new Label("                                                                                            ");
    TextField tf=new TextField(30);
    add(tf);
    add(l1);
    tf.addTextListener(this);
}
public void textValueChanged(TextEvent te)
{
    l1=new Label("                                                                                                              ");
    l1.setText("Text Event Occured");
}
    public static void main(String[] args) {
        TextEventDemo t=new TextEventDemo();
        t.setVisible(true);
        t.setTitle("TextEvent");
        t.setSize(500,500);
    }
}