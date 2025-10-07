package OOP.Inheritance;
//Has a relationship
// in which we do not used extend keyword to access another class data we used create object of that class in another class
// this process is manual and if we used extend this is automatic
//has-a-relationship is manual and is-a-relationship is automatic(it create object of another class automatically)
class R1{
    void get1(){
        System.out.println("R1");
    }
}
class R2{
    R1 r1 = new R1();
    void get2(){
        System.out.println("R2");
    }
}
class R3{
    R2 r2 = new R2();
    void get3(){
        System.out.println("R3");
    }
}
public class Has_relation_inheritance {
    public static void main(String[] args){
        R3 r3 = new R3();
        r3.r2.r1.get1();
        r3.r2.get2();
        r3.get3();
    }
}
