import java.awt.*;
class DialogDemo2 extends Frame
{
    public static void main(String[] args) 
    {
        DialogDemo2 d=new DialogDemo2();
        d.setTitle("DialogFrame");
        d.setVisible(true);
        d.setSize(500,500);

        Dialog d1=new Dialog(d,"Model Dialog",true);
        d1.setLayout(new FlowLayout());
        d1.add(new Button("Ok"));
        d1.add(new Button("Cancle"));
        d1.setVisible(true);
        d1.setSize(300,300);
    }
}