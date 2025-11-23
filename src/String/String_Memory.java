package String;

public class String_Memory {
    public static void main(String[] args){
        //we can't directly update the string because string is immutable
        //aapn jevde changes karu thevdya new string create karave lagel
        String s1 ="Hello";
        String s2 = "";
        s2 = s2 + s1.concat("welcome"); //if you don't point anything in scp it assign JVM to that
                                            //string is not deleted
        System.out.println(s1);//Hello
        System.out.println(s2);//Hellowelcome


        String s3 = "aabbcc";
        String s4 = "";
        for (int i = 0; i< s3.length(); i++){
            int c = 0;
            for (int j = i + 1; j< s3.length(); j++){
                if(s3.charAt(i) == s3.charAt(j)){
                    c++;
                }
            }
            if(c==0){
//                System.out.println(s3.charAt(i));
                s4 = s4 + s3.charAt(i);
            }
        }
        System.out.println(s4);
    }
}
