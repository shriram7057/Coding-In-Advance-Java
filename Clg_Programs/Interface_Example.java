
//interface-> collection of a final static variables and abstract methods! 
import java.util.*;

interface Client {
    void input();// bydefault public/abstract and final variables!

    void output();
}

class Interface_Example implements Client {
    String name;
    double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        name = sc.next();
        System.out.println("Enter Salary");
        salary = sc.nextDouble();
    }

    public void output() {
        System.out.println("Username->" + name);
        System.out.println("Salary->" + salary);
    }

    public static void main(String[] args) {
        Client c = new Interface_Example();
        c.input();
        c.output();
    }
}