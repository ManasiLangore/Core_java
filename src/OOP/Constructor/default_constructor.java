package OOP.Constructor;

class task7{
    void get(){
        System.out.println("get");
    }
}
public class default_constructor {
    public static void main(String[] args){

        task7 t1 = new task7();
        t1.get();
        //task7() is default constructor
    }
}
