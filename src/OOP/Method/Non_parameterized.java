package OOP.Method;

class Task{
    int id = 12;
    //create a non-parameterized methode
    //() -> sangtay ki this is Method.method
    void get() {
        System.out.println("Welcome");
    }

    void dispaly() {
        System.out.println("Hello");
    }
}
public class Non_parameterized {

    public static void main(String[] args) {


        //create object
        Task t1 = new Task();
        System.out.println(t1.id);

        //accessing Method.method
        t1.get();
        t1.dispaly();

    }
}
