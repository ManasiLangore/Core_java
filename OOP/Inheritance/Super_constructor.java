package OOP.Inheritance;
//super constructor
//it used when we have to access one class constructor in another class


class Su1{
    Su1(int n){
        System.out.println("Parent constructor" +" " + n);
    }
}
class Su2 extends Su1{

    Su2(){

        super(2);  //Super constructor

        System.out.println("Child constructor");
    }
}
public class Super_constructor {
    public static void main(String[] args){
        Su2 s = new Su2();
    }
}
