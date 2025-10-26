package OOP.Polymorphism;
class Calculator {
    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different parameters)
    double add(double a, double b) {
        return a + b;
    }

    // Method 3 (different number of arguments)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Overloading_method {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));        // Calls Method 1
        System.out.println(c.add(5.5, 10.5));    // Calls Method 2
        System.out.println(c.add(5, 10, 15));
    }
}
