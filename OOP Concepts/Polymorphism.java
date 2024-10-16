// package oopConcept;

class poly{
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    void add(int a, double b){
        double c=a+b;
        System.out.println(c);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        poly p1=new poly();
        p1.add();
        p1.add(100,200);
        p1.add(20,20.51);
    }
}
