// package oopConcept;

public class Clobj {
    public static void main(String[] args) {
      dog d1=new dog();
      d1.age=12;
      d1.name="tuffy";
//      d1.color="white";
        System.out.println(d1.age+" "+d1.name+" "+d1.color);
      d1.eating();
      d1.walking();
    }
}

class dog{
    int age;
    String name;
    String color;

    void eating(){
        System.out.println("Dog is eating");
    }
    void walking(){
        System.out.println("Dog is walking");
    }
}