package OOP.Constructor;
//constructor overloading possiable
class task9{
    task9(){
        System.out.println("By default");
    }
    task9(int n){
        System.out.println("Number is :" + n);
    }
    task9(String s){
        System.out.println("String is :" + s);
    }
    task9(char c){
        System.out.println("Charactre is :" + c);
    }
}

public class Overloading_constructor {
    public static void main(String[] args){
        task9 t1 = new task9();

        task9 t2 = new task9(2);

        task9 t3 = new task9("Manasi");

        task9 t4 = new task9('M');

    }
}
