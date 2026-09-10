// Program to demonstrate Method Overriding
class Animal {
    
// Superclass method
    
void sound() {
        System.out.println("Animals make different sounds");
    }
}

class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a;  // reference of superclass

        a = new Dog();   // object of subclass Dog
        a.sound();       // calls Dog's overridden method

        a = new Cat();   // object of subclass Cat
        a.sound();       // calls Cat's overridden method

        a = new Animal(); // object of superclass
        a.sound();        // calls superclass method
    }
}
