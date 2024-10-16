// package oopConcept;

public class classAndObjects {
    public static void main(String[] args) {
      Student s1=new Student();
      s1.name="ram";
      s1.rollNo=24;
      s1.study();
        System.out.println("your name is "+s1.name+" "+s1.rollNo);
      Student s2=new Student();
      s2.name="geeta";
      s2.study();
      s2.study(2);
    }
}
class Student{

    int rollNo;
    String name;
    void study(){
        System.out.println(name+" is studying");
    }
    void listen(){
        System.out.println(name+" is listening");
    }
    void study(int hours){
        System.out.println(name+" studied "+hours+" hours.");
    }
}