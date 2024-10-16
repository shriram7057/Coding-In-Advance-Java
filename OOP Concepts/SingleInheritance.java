// package oopConcept;

class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
public class SingleInheritance{

    public static void main(String[] args) {
    Dog d1=new Dog();
    d1.bark();
    d1.eat();
    }
}
