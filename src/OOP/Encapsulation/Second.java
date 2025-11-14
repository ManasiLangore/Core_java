package OOP.Encapsulation;

class Encap{
    private  String x;  //private variable
    private int i;
    private float f;

    public void setX(String x, int i, float f){
        this.x = x;
        this.i= i;
        this.f = f;

    }
    public String getx(){
        return x;
    }
    public int getI(){
        return i;
    }
    public float getF(){
        return f;
    }

}
public class Second {
    public static void main(String[] args){
        Encap obj = new Encap();
        obj.setX("Manasi", 250,123.43f );   //private variable accessed outside class        System.out.println(obj.getx());
        System.out.println(obj.getx());   //Manasi
        System.out.println(obj.getI());   //250
        System.out.println(obj.getF());   //123.43

    }
}
