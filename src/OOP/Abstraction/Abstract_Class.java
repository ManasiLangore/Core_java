package OOP.Abstraction;
 //if we create abstract method it is necessary to create abstract class

    abstract  class car{   // abstract class

        abstract void drive();   //anstract method

        void palyMusic(){      // simple method
            System.out.println("Paying music in car...");
        }
    }

    class WagonR extends car{
        void drive(){   // abstract methode call in another class
            System.out.println("Driving a car...");
        }
    }

public class Abstract_Class {
    public static void main(String[] args){

        car obj = new WagonR();  //we can't create object of abstract class
        obj.drive();
        obj.palyMusic();
    }

}
