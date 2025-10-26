package OOP.Polymorphism;
//static bolck
//first prority give to static block
//static block automatically called we have to only create object but no need to call static block automatically called
//
class Static_B{
    //normal method
    void get(){
        System.out.println("Normal method");
    }
    //static block
    static{
        System.out.println("Static block");
    }
}
public class Static_block {
    public static void main(String[] args){
        Static_B s1 = new Static_B();
        s1.get();

    }
}
