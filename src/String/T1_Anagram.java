package String;

import java.util.Arrays;

public class T1_Anagram {

    //task => given two string identify this anagram or not
    //     anagram = first it check length of string
    //               if length same = process for anagram else not same then not anagram
    //               second check string equality
    //               it doesn't matter sequence of char,
    //               but it should be same char in both string


    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        //1)check length of sting is same or not
        if(s1.length() == s2.length()){
//            System.out.println("length is same");

            //2)check the equality of string
            //conversion string to char array
            char ch1[] = s1.toCharArray();//listen
            char ch2[] = s2.toCharArray();//silent
            //now sort array to check equality
            Arrays.sort(ch1);//eilnst
            Arrays.sort(ch2);//eilnst
            System.out.println(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("this is anagram");
            }
            else{
                System.out.println("this is not anagram");
            }
        }
        else{
            System.out.println("because length of string is not same this is not anagram");
        }
    }
}
