import javax.swing.*;

class TextFieldExample1 {
    public static void main(String[] args) {
        JFrameDemo f = new JFrameDemo("Example of TextField ");

        JTextField t1, t2;
        t1 = new JTextField("Welcome");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Tutorial on AWT");
        t2.setBounds(50, 150, 200, 30);

        f.add(t1);
        f.add(t2);
        f.setSize(450, 450);

        f.setLayout(null);

        f.setVisible(true);
    }
}
