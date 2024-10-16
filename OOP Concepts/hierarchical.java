// package oopConcept;
class suresh{
    void walk(){
        System.out.println("suresh is walking");
    }
}
class Seeta extends suresh{
    void read(){
        System.out.println("seeta is reading");
    }
}
class geeta extends suresh{
    void write(){
        System.out.println("geeta is writing");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        geeta g1=new geeta();
        g1.write();
        g1.walk();
        
    }
}
