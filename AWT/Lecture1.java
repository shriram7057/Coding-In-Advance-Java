import java.awt.*;

//create button by creating the object of frame class
class Lecture1 {
    Lecture1(){
        Frame f= new Frame();
        Button b1= new Button("Click");
        f.add(b1);
        b1.setBounds(20,80,80,30);
        f.setSize(400,500);
        f.setTitle("AWT");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Lecture1 l=new Lecture1();
    }
}
