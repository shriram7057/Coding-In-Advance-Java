import java.awt.*;
class Lecture2 {
    Lecture2(){
        Frame f1=new Frame();
        Label l=new Label("stud_ID");
        Button b=new Button("submit");
        TextField t=new TextField();

        l.setBounds(20,80,80,30);
        b.setBounds(20,120,80,30);
        t.setBounds(110,120,80,30);

        f1.add(l);
        f1.add(b);
        f1.add(t);

        f1.setSize(400,500);

        f1.setTitle("AWT");
        f1.setLayout(null);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        Lecture2 l1=new Lecture2();
    }

}
