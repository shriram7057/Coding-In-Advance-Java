// Java program for Method overloading
class MultiplyFun {
    // Method to multiply two integers
    static int Multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply two doubles
    static double Multiply(double a, double b) {
        return a * b;
    }
}

class CompileTimePolymorphism {
    public static void main(String[] args) {
        // Call Multiply methods from MultiplyFun class
        System.out.println(MultiplyFun.Multiply(2, 4));       // Calls the int version
        System.out.println(MultiplyFun.Multiply(5.5, 6.3));    // Calls the double version
    }
}
