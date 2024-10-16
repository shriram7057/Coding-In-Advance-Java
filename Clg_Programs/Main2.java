// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Calls the method in Animal class

        // Creating an instance of Dog
        Dog myDog = new Dog();
        myDog.sound();  // Calls the overridden method in Dog class

        // Using the parent class reference for child class object
        Animal myAnimalDog = new Dog();
        myAnimalDog.sound();  // Calls the overridden method in Dog class
    }
}
