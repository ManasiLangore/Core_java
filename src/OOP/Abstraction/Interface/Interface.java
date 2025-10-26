package OOP.Abstraction.Interface;

interface vehicle{
    void drive();     //here in interface  we don't need  to write abstract keyword
                      // interface method (does not have a body)
}

class Car implements vehicle {
    public void drive() {
        System.out.println("Car is starting...");
        System.out.println();
        System.out.println();
    }
}

public class Interface {
    public static void main(String[] args) {
        vehicle v = new Car();
        v.drive();
    }
}
