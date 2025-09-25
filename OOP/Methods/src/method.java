class Demo{
    void get(float a) {
        System.out.println("Get methode :" + a);
    }

    void set(int n, String s) {
        System.out.println("set methode : " + n + " and "+s);
    }

    void met(double x, int y) {
        System.out.println("met methode : "+ x + " and "+y);
    }
}

public class method {
    public static void main(String[] args) {


        Demo d1 = new Demo();

        d1.get(1.5f);

        d1.set(12, "Manasi");

        d1.met(1.55, 156);
    }
}
