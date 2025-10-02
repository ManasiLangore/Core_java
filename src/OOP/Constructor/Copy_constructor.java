package OOP.Constructor;

class task14{

    //usally copy constructor not used in market because it required double memory to copy the
    //

    int i;
    String n;
    int p;

    //original constuctor
    task14(int id,String name,int pin){
        i = id;
        n = name;
        p = pin;
    }

    //copy constructor
    task14(task14 a){
        i = a.i;
        n = a.n;
        p = a.p;
    }

    //methode to print values
    void show(){
        System.out.println("ID : "+i );
        System.out.println("Name : "+n);
        System.out.println("PIN Code : " +p);
    }
}
public class Copy_constructor {
    public static void main(String[] args){
        //object for original constructor
        task14 t1 = new task14(101,"Manasi",411024);
        t1.show();

        //object for copy constructor
        task14 t2 = new task14(t1);
        t2.show();

        //one the copy constructor body is created we can create multiple objects and used copy constructor body
        //multiple time
        task14 t3 = new task14(t2);
        t3.show();


    }
}
