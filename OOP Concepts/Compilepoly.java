// package oopConcept;

class polymor{
    void sum(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void sum(int a, int b){
        int c =a+b;
        System.out.println(c);
    }
    void sum(int a, double b){
        double c=a+b;
        System.out.println(c);
    }
}
public class Compilepoly {
    public static void main(String[] args) {
        polymor p1=new polymor();
        p1.sum();
    }

}
