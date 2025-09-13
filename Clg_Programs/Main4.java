// First Interface
interface Animal {
    void sound(); // Abstract method
}

// Second Interface
interface Pet {
    void type(); // Abstract method
}

// Class Dog implementing both interfaces (Animal and Pet)
class Dog implements Animal, Pet {

    // Implementing the sound method from the Animal interface
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Implementing the type method from the Pet interface
    public void type() {
        System.out.println("The dog is a domestic pet.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();

        // Calling methods from both interfaces
        myDog.sound();  // Output: The dog barks.
        myDog.type();   // Output: The dog is a domestic pet.
    }
}
