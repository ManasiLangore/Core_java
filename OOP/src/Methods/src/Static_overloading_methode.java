class Test3{
    static void get(){
        System.out.println("static methode");
    }

    static void get(int a){
        System.out.println("static methode" + a);
    }

    static void get(String s){
        System.out.println("static methode" + s);
    }
}

public class Static_overloading_methode {
    public static void main(String args[]){
         Test3.get();
         Test3.get(3);
         Test3.get("manasi");
    }
}
