class Test1{
    static void get() { //static methode (do not need object)
        System.out.println("Static methode");
    }
    void set1() {  // non static methode(object is mandetory)
        System.out.println("Non-Static methode");
    }
}

public class Static_NonStatic_method {

    static void set(){
       System.out.println("static method within same class");
    }
    public static void main(String[] args) {


        Test1 t1 = new Test1();
        Test1.get();  //methode is static so we required class to call
        t1.set1();

        set();  //methode  is within a same class so we do not required any class or obiect to call
    }
}
