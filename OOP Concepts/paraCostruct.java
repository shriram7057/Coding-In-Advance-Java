// package oopConcept;

public class paraCostruct {
    public static void main(String[] args) {
     car c1=new car(2,"Seema");

    }
}
class car{
    int x; String y;
    car(int a,String b){
        x=a;
        y=b;
        System.out.println(x+" "+y);
    }

}