import java.awt.*;
import java.awt.event.*;
public class UiElements extends Frame implements ActionListener 
{
    TextField t;
    UiElements()
    {
        Label l=new Label("AJP");
        l.setBounds(50,100,90,30);
        l.setText("AJP Lecture");
        add(l);

        TextField t=new TextField();
        t.setBounds(160,100,90,30);
        t.setText("hello");
        add(t);

        Checkbox c1=new Checkbox("AJP",null,true);
        Checkbox c2=new Checkbox("JSP",null,false);
        Checkbox c3=new Checkbox("CNS",null,false);

        c1.setBounds(50,160,50,50);
        c2.setBounds(150,160,50,50);
        c3.setBounds(250,160,50,50);
        add(c1); add(c2); add(c3);

        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox c4=new Checkbox("male",cbg,false);
        Checkbox c5=new Checkbox("Female",cbg,true);

        c4.setBounds(50,250,50,50);
        c5.setBounds(150,250,50,50);
        add(c4); add(c5);

        List l1=new List(3,true);
        l1.add("CS"); l1.add("IT"); l1.add("chem");
        l1.setBounds(50,350,50,50);
        add(l1);

        Choice c=new Choice();
        c.add("AJP"); c.add("JSP"); c.add("CNS");
        c.setBounds(50,450,50,50);
        add(c);

        TextArea ta=new TextArea();
        ta.setBounds(150,350,100,100);
        add(ta);

        MenuBar mbar=new MenuBar();
        setMenuBar(mbar);
        Menu file=new Menu("File");
        MenuItem i1,i2;
        
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        mbar.add(file);

        Button b1=new Button("clear");
        b1.setBounds(50,480,50,50);
        b1.addActionListener(this);
        add(b1);

        setSize(400,600);
        setLayout(null);
        setVisible(true);
        setTitle("UI Elements program");
    }
    public void actionPerformed(ActionEvent e)
    {
        String tf=t.getText();
        String d="";
        t.setText(String.valueOf(d));
    }
    public static void main(String[] args) 
    {
        UiElements u=new UiElements();
    }
}
