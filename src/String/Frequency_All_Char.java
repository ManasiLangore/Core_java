package String;

public class Frequency_All_Char {
    public static void main(String[] args){

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

        //find frequency of all character
        String s1 = "rejgopeanvkpababhirbn";
        for(char ch='a'; ch<='z'; ch++){
            int cnt =0;
            for(int i=0 ;i<s1.length(); i++){
                if(ch == s1.charAt(i)){
                    cnt ++;
                }
            }
            if(cnt!=0){
            System.out.println(ch +" = "+cnt);
            }
        }

        //if string consist  of both upper and lower case letter
        String s2 = "ssASJDkckSKDC";
        for(char ch='A'; ch<='z'; ch++){//only go from A to z
            int cnt =0;
            for(int i=0 ;i<s2.length(); i++){
                if(ch == s2.charAt(i)){
                    cnt ++;
                }
            }
            if(cnt!=0){
                System.out.println(ch +" = "+cnt);
            }
        }
    }
}
