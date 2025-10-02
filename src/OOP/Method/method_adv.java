package OOP.Method;

class Task4{
    int g;
    String s;
    void get(int n , String name){
        g = n;
        s = name;
    }
    void show(){
        System.out.println(g);
        System.out.println(s);
    }
}

public class method_adv {
    public static void main(String[] args){

        Task4 t1 = new Task4();

        t1.get(12, "Manasi");
        t1.show();
    }
}
