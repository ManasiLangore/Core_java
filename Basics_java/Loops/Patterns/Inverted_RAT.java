package Basics_java.Loops.Patterns;

public class Inverted_RAT {
    public static void main(String[] args) {


        //      *     r1 = 4sp + 1s
        //    **		 r2 = 3sp + 2s
        //   ***		 r3 = 2sp + 3s
        //  ****		 r4 = 1sp + 4s
        // *****		 r5 = 0sp + 5s
        //     row(inc) = space(dec) + star(inc)

//		for(int i=1; i<=5 ; i++) {      //   if increment then condition is lessthan(<=)
//
//			for(int j=4; j>=i; j--) {   //   if decrement then condition is graterthan(>=)
//				System.out.print(" ");
//			}
//
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

        //character pattern
//		A to Z = 65-90 & a to z = 97-122
//		A=65,B=66,C=67,D=68,E=69

//	  	      A
//		     AB
//		    ABC
//		   ABCD
//		  ABCDE

        for(int i=65; i<=69; i++) {//outer loop 65---69

            //i=66   66<=69
            for(int k=69; k>=i; k--) {//space loop iterate eache row for 5 times
                //k=69  69>=66

                System.out.print(" ");
            }
            for(int j=65; j<=i; j++) {// printing char
                //j=66  66<=65
                System.out.print((char) j);
            }
            System.out.println();
        }

        //inverted right angle triangle => * * * * *
        //								   * * * *
        //								   * * *
        // 								   * *
        //								   *

        for(int i=1; i<=5; i++) {

            for(int j=5; j>=i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // * * * * *    r1 = 0sp + 5s
        // - * * * *		r2 = 1sp + 4s
        // - - * * *		r3 = 2sp + 3s
        // - - - * *		r4 = 3sp + 2s
        // - - - - *		r5 = 4sp + 1s
        //         row(inc) = space(inc) + star(dec)

//		for(int i =1; i<=5; i++) {   // i = 1
//
//			for(int j=1 ; j<=i ; j++) {  // j =1 : 1<=1T : 2<=1F => -
//				System.out.print(" ");
//			}
//
//			for (int k=4; k>=i; k-- ) {  // k =4 : 4>=1T :3>=1T :2>=1T :1>=1T :0>=1T =>****
//				System.out.print("*");
//			}
//			System.out.println();  //cursor goes to next line
//		}


//  character pattern
//		 ABCDE
//		  ABCD
//		   ABC
//		    AB
//		     A



        for(int i=69; i>=65; i--) {
            for(int k=69; k>=i; k--) {
                System.out.print(" ");
            }
            for(int j=65; j<=i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }

    }
}
