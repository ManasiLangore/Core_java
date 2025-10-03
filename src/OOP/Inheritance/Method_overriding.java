package OOP.Inheritance;
//method overriding
//occure when 1-only is a relationship(if we use extends keyword
class O1{
    void get(){ // existed method
        System.out.println("O1 class");
    }
}

class O2 extends O1{
    //the method of child class has override on parent's method
    void get(){ //updated method
        System.out.println("O2 class");
    }
}
public class Method_overriding {
    public static void main(String[] args){
        O2 o = new O2();
        o.get();   //O2 class
    }
}
