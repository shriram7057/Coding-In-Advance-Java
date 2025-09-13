final class Immutaleclass
{
    public void show()
    {
        System.out.println("This is a final class!");
    }
}
// can not entends the final class
public class Final_Class {

     public static void main(String[] args) {
        Immutaleclass i=new Immutaleclass();
        i.show();
     }
}