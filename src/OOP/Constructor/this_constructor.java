package OOP.Constructor;

class task13{
    // note : 1) one constructor only call another one constructor
    //           constructor can not call multiple constuctor
    //        2) in constructor intial statement is always this(which another constructor we want to call)

    task13(){
        this(2);
        System.out.println("get");

    }

    task13(int n){
        this("Manasi");
        System.out.println("Integer : "+ n);
    }

    task13(String s){
        this(12.43);
        System.out.println("String : "+s);
    }

    task13(double d){
        this(12.56f);
        System.out.println("Double :"+d);
    }

    task13(float f){
        System.out.println("Float : "+f);
    }

    void call(){


    }
}

public class this_constructor {
    public static void main(String[] args){
        task13 t1 = new task13();
    }
}
