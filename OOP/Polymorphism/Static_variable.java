package OOP.Polymorphism;
//  static variable
//->limited  for class {}
//we do not need to create object to call variable


class Hefshine{

    static String name = "hefshine";
}

public class Static_variable {
    public static void main(String[] args){
        Hefshine h1 = new Hefshine();
        System.out.println(Hefshine.name);  //we can call static variable through class name
    }
}
