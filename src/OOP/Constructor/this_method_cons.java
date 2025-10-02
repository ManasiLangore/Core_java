package OOP.Constructor;



class task12{
    void get(){
        System.out.println("get");
    }
    void get1(){
        System.out.println("get1");
    }
//    void show(){
//        this.get();  // call get() methode
//        this.get1(); //call get1() methode
//        System.out.println("show");
//    }

    void show(){
        //no need to add this keyword because compiler has no confusion so
        //it doesn't matter if you add this or not
        //*note : this keyword automatically add by the compiler while
        //        the complititon(if don't add this keyword in program)

        get();
        get1();
        System.out.println("show");
    }
}
public class this_method_cons {
    public static void main(String[] args){

        task12 t1 = new task12();
        t1.show();
    }
}



