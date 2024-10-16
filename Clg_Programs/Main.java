interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird { // Multiple inheritance via interfaces
    public void eat() {
        System.out.println("Bat is eating.");
    }

    public void fly() {
        System.out.println("Bat is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
