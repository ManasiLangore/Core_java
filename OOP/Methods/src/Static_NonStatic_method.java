class Test1{
    static void get() { //static methode (do not need object)
        System.out.println("Static methode");
    }
    void set1() {  // non static methode(object is mandetory)
        System.out.println("Non-Static methode");
    }
}

public class Static_NonStatic_method {
    public static void main(String[] args) {


        Test1 t1 = new Test1();
        Test1.get();  //methode is static so we required class to call
        t1.set1();
    }
}
