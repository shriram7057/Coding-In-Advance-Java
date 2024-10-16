// package oopConcept;


public class StaticBlock {
    static int a=10;
    void eat(){
        System.out.println("eating");
    }
    StaticBlock(){
        System.out.println("this is constructor");
    }
    static {
        System.out.println("static block");
        System.out.println(a);
    }
    public static void main(String[] args) {
        StaticBlock s1=new StaticBlock();
        s1.eat();

    }
}
