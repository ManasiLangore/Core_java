package OOP.Constructor;

class task11{
    int n;
    String s;
    task11(int n, String s){
        this.n = n; //global = local
                    //this keyword only work for global

        this.s = s;
    }
    void show(){
        System.out.println(n);
        System.out.println(s);
    }
}

public class this_variable_cons {
    public static void main(String[] args){

        task11 t1 = new task11(2, "Manasi");
        t1.show();
    }
}
