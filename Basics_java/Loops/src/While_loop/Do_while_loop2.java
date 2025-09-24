package While_loop;
import java.util.*;

public class Do_while_loop2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		using swich statement
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number");
        num = in.nextInt();

        System.out.println("1.Even/Odd");
        System.out.println("2.Positive/Negative");
        System.out.println("3.Exit");
        int ch;
        do {

//			int ch;
            System.out.print("Enter Choice");
            ch = in.nextInt();

            switch(ch) {
                case 1:
                    if(num % 2 == 0) {
                        System.out.println("Even");
                    }
                    else {
                        System.out.println("Odd");
                    }
                    break;
                case 2:
                    if(num > 0) {
                        System.out.println("Positive");
                    }
                    else if(num < 0) {
                        System.out.println("Negative");
                    }
                    else {
                        System.out.println("Zero");
                    }
                    break;
                case 3 :
                    System.out.println("Exit");
                    break;
                default :
                    System.out.println("Inavalid Input");
            }
        }
        while(ch!=3);

    }
}
