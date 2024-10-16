
//default costructor
public class Costructor {
    public static void main(String[] args) {
        Cons c1=new Cons();
        c1.show();
    }
}
class Cons{
    int age;
    String name;
//    Cons(){
//        age=20;
//        name="supriya";
//    }
    void show(){
        System.out.println(age+" "+name);
    }
}