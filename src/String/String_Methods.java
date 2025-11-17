package String;

public class String_Methods {
    public static void main(String[] args){
        //public final class string implements charsequence, comparable, clonable
        //{
        //    have predefined methods
        //    also a constructor
        //}


        String s1 = "Manasi";
        System.out.println(s1);  //Manasi

        //predefined methods
        //1) find length of given string
        System.out.println("Find length of string : ");
        System.out.println(s1.length());  //6

        //2)Upper case and lower case conversion
        System.out.println("Find upper and lower case letter : ");
        System.out.println(s1.toUpperCase());  //MANASI
        System.out.println(s1.toLowerCase());  //manasi

        //3)Unnecessary spaces remove
        System.out.println("remove unnecessary spaces : ");
        String s2 = "   sad fr gdzfgbh gf   ";
        System.out.println(s2.trim());  //sad fr gdzfgbh gf

        //4)to check equality
        System.out.println("To check equality : ");
        String s3 ="Manasi";
        System.out.println(s1==s3); //true(there memory address is same)
        String s4 = new String("Manasi");
        System.out.println(s1==s4); //false (there memory address is different|
                                             // == ->check memory address)
        System.out.println(s1.equals(s4));//true (this methode only choose content in the stirng|
                                                  // equals -> check content of the string)

        //5)to get individual character of a string
        System.out.println("To find Individual char of string");
        System.out.println(s1.charAt(0));//M
        System.out.println(s1.charAt(1));//a
        System.out.println(s1.charAt(2));//n
        System.out.println(s1.charAt(3));//a
        System.out.println(s1.charAt(4));//s
        System.out.println(s1.charAt(5));//i
        //to make it simple use for loop
        for(int i=0; i<s1.length(); i++){
            System.out.println(s1.charAt(i));
            //M
            //a
            //n
            //a
            //s
            //i
        }

        //6) find index of given character
        System.out.println("Indexes of char : ");
        System.out.println(s1.indexOf('M')); //0
        System.out.println("Index of s = "+s1.indexOf('s')); //4
        for(int i=0; i<s1.length(); i++){
            System.out.println(s1.indexOf(s1.charAt(i)));
            //0
            //1
            //2
            //1
            //4
            //5
        }
    }
}
