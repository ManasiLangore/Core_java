package String.Buffer;

public class Demo {
    public static void main(String[] args){
        //string buffer=> predefined, mutable,it is not final class
        //if we want frequents changes then use string buffer
        // default value = 16 char

        StringBuffer s1 = new StringBuffer();
        s1.append("Manasi");
        StringBuffer s2 = new StringBuffer();
        s2.append("Manasi");
        //in string buffer .equals() check first address and then content
        if(s1.equals(s2)){
            System.out.println("same");
        }
        else {
            System.out.println("not equale");
        }

    }
}
