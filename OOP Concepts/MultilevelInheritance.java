// package oopConcept;

class Car{
    void move(){
        System.out.println("car is moving");
    }
}
class BMW extends Car{
   void stop(){
       System.out.println("car is stopped");
   }
}
class BMW_A extends BMW{
    void start(){
        System.out.println("car started");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        BMW_A b1=new BMW_A();
        b1.start();
        b1.move();
        b1.stop();
    }
}
