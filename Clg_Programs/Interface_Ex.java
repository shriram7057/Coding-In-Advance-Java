// Base class A
class A {
    void show() {
        System.out.println("A's show()");
    }
}

// First intermediate interface (Parent 1)
interface B {
    void show();
}

// Second intermediate interface (Parent 2)
interface C {
    void show();
}

// Class D implementing both interfaces
class D extends A implements B, C {
    @Override
    public void show() {
        System.out.println("D's show()");
    }
}

public class Interface_Ex {
    public static void main(String[] args) {
        D d = new D();
        d.show(); // Output: D's show()
    }
}
