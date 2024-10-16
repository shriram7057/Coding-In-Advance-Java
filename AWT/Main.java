import java.awt.*;

class test extends Frame {
    test() {
        Button b1 = new Button("click me");
        add(b1);
        b1.setBounds(50, 50, 90, 30);
        setSize(400,400);
        setTitle("first awt program");
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        test t = new test();
    }
}