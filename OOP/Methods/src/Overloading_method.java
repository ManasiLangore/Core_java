class Demo1{
    void get() { //methode overloading ,eans multiple methode have same name nut different para
        System.out.println("get");
    }
    void get(int n) {
        System.out.println("get = "+ n);
    }
    void get(float n) {
        System.out.println("get = "+ n);
    }
}

public class Overloading_method {
    public static void main(String[] args) {


        Demo1 d1 = new Demo1();

        d1.get();
        d1.get(25);
        d1.get(11.5f);

    }
}
