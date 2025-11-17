package String;

public class Basic {
    public static void main(String[] args){

        String s = "abc";
        System.out.println(s);

        String obj = new String("abc22");
        System.out.println(obj);

        if(s == obj){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
