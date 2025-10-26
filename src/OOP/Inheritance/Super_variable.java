package OOP.Inheritance;
// super variable
//we can access parent data in child data
class S1{
    int a = 10;
}
class S2 extends S1{
    int a = 20;
    void show(){
        System.out.println("Parents data : "+super.a);
        System.out.println("Childs data : "+a);

    }
}
public class Super_variable {
    public static void main(String[] args){

        S2 s2 = new S2();
        s2.show();
    }
}
