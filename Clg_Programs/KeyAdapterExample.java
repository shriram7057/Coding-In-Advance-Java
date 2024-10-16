import java.awt.*;
import java.awt.event.*;
public class KeyAdapterExample extends KeyAdapter
{
    Frame f;
    Label l;
    TextArea area;
    KeyAdapterExample()
    {
        f=new Frame("Key Adapetr");
        l=new Label();
        l.setBounds(20, 50, 200, 20);
        area=new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);
        f.add(area);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void addKeyListener(KeyEvent e)
    {
        String text=area.getText();
        String Words []=text.split("\\s");
        l.setText("Words:"+Words.length+"character:"+text.length());
    }
    public static void main(String args[])
    {
        new KeyAdapterExample();
    }
}
