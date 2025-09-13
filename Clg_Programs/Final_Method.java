class Parent
{
    public final void display()
    {
        System.out.println("This is Final method of Parent class");
    }
}
class Child extends Parent
{
//     cant override display() method because its final in parent class
}
public class Final_Method
{
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
}