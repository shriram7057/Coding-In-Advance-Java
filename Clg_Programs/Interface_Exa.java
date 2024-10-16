// The common base interface (Grandparent)
interface A {
    void show();
}

// The first intermediate interface (Parent 1)
interface B extends A {
    // No implementation needed here
}

// The second intermediate interface (Parent 2)
interface C extends A {
    // No implementation needed here
}

// The class that implements both B and C (Child)
class D implements B, C {
    @Override
    public void show() {
        System.out.println("D's show()");
    }
}

class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        D d = new D();
        d.show(); // Output: D's show() inheritance graph and avoided the diamond problem.




    }
}
