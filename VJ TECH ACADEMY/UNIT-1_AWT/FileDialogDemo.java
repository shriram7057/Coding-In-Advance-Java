import java.awt.*;
class FileDialogDemo extends Frame
{
    public static void main(String args[])
    {
        FileDialogDemo f=new FileDialogDemo();
        f.setVisible(true);
        f.setSize(500,500);
        f.setTitle("FileDialog");

        FileDialog d=new FileDialog(f,"open",FileDialog.SAVE);
        d.setVisible(true);
    }
}