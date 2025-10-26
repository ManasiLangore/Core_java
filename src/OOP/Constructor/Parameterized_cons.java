package OOP.Constructor;

class task10{
    int a;
    //constructor is used to take value
    task10(int n){
        a = n;
    }
    //method is used to print value
    void show(){
        System.out.println(a);
    }
}
public class Parameterized_cons {
    public static void main(String[] args){

        task10 t1 = new task10(2);
        t1.show();
    }
}
