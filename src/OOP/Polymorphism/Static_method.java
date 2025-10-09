package OOP.Polymorphism;
//ststic method
//we do not need to create object to call method
class Static{
    static void show(){
        System.out.println("Static_Method");
    }
}
public class Static_method {
    public static void main(String[] args){
        Static.show();//no object

    }
}
