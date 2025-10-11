package OOP.Inheritance;

class A1{
    A1(){
        System.out.println("Constructor A1");

    }
}
class B1 extends A1{
    B1(){
        System.out.println("Constructor B1");
    }
}
public class Inheritance_Constructor {
    public static void main(String[] args){

        B1 b = new B1();
    }
}
