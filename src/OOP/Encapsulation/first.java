package OOP.Encapsulation;


class Encap1{
    private  String x;  //private variable

     public void setX(String x){
         this.x = x;

    }

    public String getx(){
         return x;
    }

}
public class first {
    public static void main(String[] args){
        Encap1 obj = new Encap1();
        obj.setX("Manasi");   //private variable accessed outside class
        System.out.println(obj.getx());
        //output => Manasi

    }
}
