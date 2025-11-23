package String;

public class Vowels_Consonants {
    public static void main(String[] args) {
        //task => vowels and consonant count
        String s8 = "aoiseigojvbnhu";
        int c2 = 0;
        int c1 = 0;
        for (int i = 0; i < s8.length(); i++) {
            if (s8.charAt(i) == 'a' || s8.charAt(i) == 'e' || s8.charAt(i) == 'i' ||
                    s8.charAt(i) == 'o' || s8.charAt(i) == 'u') {
                c2++;
            } else {
                c1++;
            }
        }
        System.out.println("vowels:" + c2);//7
        System.out.println("consonants: " + c1);//7

        //another approach
        String s = "iughgurxjgugaizkvniiwqewq";
        int cnt = 0;
        int cnt1 = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    cnt++;
                    break;
                case 'e':
                    cnt++;
                    break;
                case 'i':
                    cnt++;
                    break;
                case 'o':
                    cnt++;
                    break;
                case 'u':
                    cnt++;
                    break;
                default:
                    cnt1++;
            }

        }
        System.out.println("Count of Vowels:" + cnt);
        System.out.println("Count of Consonant: " + cnt1);
    }
}
