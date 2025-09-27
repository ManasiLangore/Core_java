class Task5{
    int show(int a, int b){
        return a+b;
    }

    String show1(String s){
        return s;
    }

    float show2(float f){
        return f;
    }

    double show3(double d){
        return d;
    }

    long show4(long l){
        return l;
    }

    char show5(char c){
        return c;
    }

    short show6(int sh){
        return (short)sh;
    }
}

public class Return_InMethod {
    public static void main(String[] args){

        Task5 t1 = new Task5();

        System.out.println("Int : "+t1.show(10,20));

        System.out.println("String : "+t1.show1("Manasi"));

        System.out.println("Float : "+t1.show2(10.56f));

        System.out.println("Double : "+t1.show3(52.56));

        System.out.println("Long : "+t1.show4(5286));

        System.out.println("Char : "+t1.show5('M'));

        System.out.println("Short : " +t1.show6(25));
    }
}
