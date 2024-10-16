import java.awt.*;
class FormDemo extends Frame
{
    FormDemo()
{
    setLayout(null);
    Label l1=new Label("Name");
    add(l1);
    l1.setVisible(true);
}
    public static void main(String[] args) {
        FormDemo f1=new FormDemo();
        f1.setVisible(true);
        f1.setTitle("Form Demo");
        f1.setSize(500,500);

    }
}