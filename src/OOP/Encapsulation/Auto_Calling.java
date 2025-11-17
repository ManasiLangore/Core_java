package OOP.Encapsulation;

class test{
    private int n;
    private String x;
    private float f;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getX() {
        return x;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setX(String x) {
        this.x = x;
    }
}
public class Auto_Calling {
    public static void main(String[] args){
        test o = new test();
        o.setN(123);
        System.out.println(o.getN());
        o.setX("Manasi");
        System.out.println(o.getX());
        o.setF(12.52f);
        System.out.println(o.getF());

    }
}
