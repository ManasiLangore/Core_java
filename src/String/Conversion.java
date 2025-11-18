package String;

public class Conversion {
    public static void main(String[] args) {
        //a +b+ c+ = abc
        //conversion from char array to string
        System.out.println("conversion from char array => string");
        char ch[] = {'a', 'b', 'c'};
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        String s1 = new String(ch);
        System.out.println(s1);

        char ch1[] = {'M','a','n','a','s','i'};
        String s2 = new String(ch1);
        System.out.println(s2);


        //conversion from string to char array
        System.out.println("Conversion from String => char array");
        String s = "Manasi";
        System.out.println(s);
        char c[] = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
        }
        System.out.println("Char array");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }
        //shortcut[.toCharArray()]
        String s3 = "abcd";
        System.out.println(s3);
        char ch3[] = s3.toCharArray();
        System.out.println("Char array");
        for(int i=0; i<ch3.length; i++){
            System.out.println(ch3[i]);
        }

    }
}
