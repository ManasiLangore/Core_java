package String;

public class Tasks {
    public static void main(String[] args){
        //task 1
        //find the frequency of given char
        String s = "anddajdaaajvnaa";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if('a' == s.charAt(i)){
                count++;
            }
        }
        System.out.println("Frequency of a = "+count);
        //output => Frequency of a = 7

        //task 2
        //find the char is present or not
        char ch = 'd';
        int c = 0;
        for (int i=0; i<s.length(); i++){
            if(ch == s.charAt(i)){
                c++;
            }
        }
        if(c == 0){
            System.out.println("Not found");
        }
        else{
            System.out.println("found");
        }
        //output => found

//        task 3
//        remove character
        String s1 = "abaccaaacaaa";
        char ch1 ='a';
        for( int i=0; i<s1.length(); i++){
            if(ch1 == s1.charAt(i)){

            }
            else{
                System.out.print(s1.charAt(i)+" ");
            }
            //b c c c
        }

        //task 4
        //replace the give char from  string
        //the string is immutable therefore we can to change string directly
        //we firstly change string to char array and then do necessary changes
        String s2 ="abcd";
        System.out.println("before : "+s2);
        char ch2[] = s2.toCharArray();
        for(int i=0; i<ch2.length; i++){
            if(ch2[i] == 'c'){
                ch2[i] = 'z';
            }
        }
        System.out.println(ch2);


    }
}
