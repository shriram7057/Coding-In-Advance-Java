import java.awt.*;

class LoginPage extends Frame {
    private static Window f1;

    LoginPage() {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        setBackground(Color.cyan);
        Button b1 = new Button("Login Page");
        Label l1 = new Label("Enter Username");
        Label l2 = new Label("Enter password");
        TextField tf1 = new TextField(20);
        TextField tf2 = new TextField(20);
      //  tf2.setEchoCharacter("*");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);

    }

    public static void main(String[] args) {
        LoginPage f1 = new LoginPage();
        f1.setVisible(true);
        f1.setName("My Frame");
        f1.setSize(500, 500);
    }
}