// package oopConcept;

class shape{
    void draw(){
        System.out.println("It can be any shape");
    }
}
class triangle extends shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("it is triangle");
    }
}
public class Runtime {
    public static void main(String[] args) {
        shape s1=new triangle();

        s1.draw();
    }
}
