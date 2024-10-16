// package oopConcept;

class c1{
    void eat(){
        System.out.println("he is eating");
    }
}
class c2 extends c1{
    void write(){
        System.out.println("he is writing");
    }
}
class c3 extends c1{
    void read(){
        System.out.println("writing");
    }
}
public class classdemo {
    public static void main(String[] args) {
        c3 obj1=new c3();
        obj1.read();
    }
}
