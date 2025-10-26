package OOP.Method;

class task6{
    //widning methode
    byte get(byte i){
        return i;
    }
}


public class Widning_method {
    public static void main(String[] args){

        task6 t1 = new task6();
        System.out.println(t1.get((byte)2));
    }
}
