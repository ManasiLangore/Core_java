package OOP.Polymorphism;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() { // Overriding parent class method
        System.out.println("Dog barks");
    }
}
public class Overriding_method {
    public static void main(String[] args) {
        Animal a = new Dog(); // Reference of parent, object of child
        a.sound();  // Output: Dog barks
    }
}
