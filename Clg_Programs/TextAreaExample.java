import javax.swing.*;
public class TextAreaExample
{
    TextAreaExample()
    {
        JFrame f=new JFrame();
        JTextArea area=new JTextArea("Welcome to Shriram Study room!!");
        area.setBounds(10,30,200,200);

        f.add(area);
        f.setSize(300,300);
        f.setVisible(true);
        f.setTitle(null);
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
}