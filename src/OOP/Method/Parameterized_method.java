package OOP.Method;

import java.util.*;

class Test{
    void get(int a) {
        System.out.println("number is = " + a);
    }
}
public class Parameterized_method {
    public static void main(String[] args) {


        Test t1 = new Test();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = sc.nextInt();

        t1.get(x);

    }
}
