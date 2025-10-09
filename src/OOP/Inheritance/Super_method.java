package OOP.Inheritance;

class SS1{
    void get(){
        System.out.println("Parent class method");
    }
}
class SS2 extends SS1{

    void get(){
        super.get();
        System.out.println("child class method");
    }
}
public class Super_method {
    public static void main(String[] args){
        SS2 s2 = new SS2();
        s2.get();
    }
}
