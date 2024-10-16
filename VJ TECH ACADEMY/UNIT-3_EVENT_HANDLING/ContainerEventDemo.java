import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.*;
class ContainerEventDemo extends Frame implements ContainerListener
{
    ContainerEventDemo()
    {
        addComponentListener((ComponentListener) this);
        setLayout(new FlowLayout());
        Button b1=new Button("Ok");
        add(b1);
    }
    public void componentAdded(ContainerEvent ce)
    {
        System.out.println("Component Added!");
    }
    public void componentRemoved(ContainerEvent ce)
    {
        System.out.println("Component Removed!");
    }
    public static void main(String[] args) {
        ContainerEventDemo c=new ContainerEventDemo();
        c.setVisible(true);
        c.setTitle("ContainerEvent Frame");
        c.setSize(500,500);
    }
}