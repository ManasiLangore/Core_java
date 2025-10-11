package Basics_java.Loops.While_loop;

public class palindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // palindrome meanse if we have given number and we reverse them then the number is same as original number then then the number is palimdrome

        int num = 121;
        int rem ;
        int rev = 0;
        int temp = num;
        while(num > 0 ) {  // 121>0T 12>0T
            // rem gives last no.
            rem = num % 10;  // rem = 121%10:1 = 12%10:2 = 1%10:
            //it print only one number which is at the last
//			System.out.println(rem);

            //formula for reverse the number (it directly give whole reverse number)
            rev = rev * 10 + rem;  //rev = 0*10+1:1 = 1*10+2:12 = 12*10+1:121

            //here we update the num value(it substract the last no.)
            num = num / 10;  //num = 121/10:12 = 12/10:1 =
        }
        //print rev number by formula at the last(it not print number 1 by 1)
        System.out.println(rev); //

        //if give no == to reverse no. palindrome
        if(temp == rev ) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
