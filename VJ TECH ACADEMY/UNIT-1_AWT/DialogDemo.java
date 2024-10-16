import java.awt.*;
class DialogDemo extends Frame
{
    public static void main(String args[])
    {
        DialogDemo d=new DialogDemo();
        d.setVisible(true);
        d.setTitle("DialogFrame");
        d.setSize(500,500);

        Dialog d1=new Dialog(d,"Model Dialog",true);
       // Dialog d1=new Dialog(d,"Modeless Dialog",false);

        d1.setLayout(new FlowLayout());
        d1.add(new Button("Ok"));
        d1.add(new Button("Cancle"));
        d1.setVisible(true);
        d1.setSize(300,300);
    }
}