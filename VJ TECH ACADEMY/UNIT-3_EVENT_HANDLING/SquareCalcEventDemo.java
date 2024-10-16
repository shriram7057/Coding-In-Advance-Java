import java.awt.*;
import java.awt.event.*;

class SquareCalcEventDemo extends Frame implements ActionListener,
        MouseListener {
    Label L1, L2;
    TextField tf1, tf2;
    Button b1;

    SquareCalcEventDemo() {
        setLayout(new FlowLayout());
        L1 = new Label("Enter Number:");
        L2 = new Label("Result:");
        tf1 = new TextField(30);
        tf2 = new TextField(30);
        b1 = new Button("Calculate Square");
        add(L1);
        add(tf1);
        add(L2);
        add(tf2);
        add(b1);
        b1.addActionListener(this);
        tf1.addMouseListener(this);
        tf2.addMouseListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int no = Integer.parseInt(tf1.getText());
        int result = no * no;
        tf2.setText(result + "");
    }

    public void mouseEntered(MouseEvent me) {
        tf1.setText(null);
        tf2.setText(null);
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseClicked(MouseEvent me) {
    }

    public static void main(String args[]) {
        SquareCalcEventDemo s1 = new SquareCalcEventDemo();
        s1.setVisible(true);
        s1.setTitle("VJTech Frame");
        s1.setSize(500, 500);
    }
}
