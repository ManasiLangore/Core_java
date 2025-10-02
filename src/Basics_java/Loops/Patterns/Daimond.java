package Basics_java.Loops.Patterns;

public class Daimond {
    public static void main(String[] args) {


        //     *
        //    * *
        //   * * *
        //    * *
        //     *

//		for(int i=1; i<=5; i++) {
//
//			for(int  j=4; j>=i; j--) {
//				System.out.print(" ");
//			}
//
//			for(int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//		for(int i =1; i<=5; i++) {
//
//			for(int j=1 ; j<=i ; j++) {
//				System.out.print(" ");
//			}
//
//			for (int k=4; k>=i; k-- ) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}


        //odd numbers star daimond
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *


        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");      //     ----
                //     ---
                //     --
                //     -
            }

            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");      //       *
                //      ***
                //     *****
                //    *******
                //   *********
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=7; k>=2*i-1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }


//	      A
//	     A B
//	    A B C
//	   A B C D
//	  A B C D E
//	  A B C D E
//	   A B C D
//	    A B C
//	     A B
//	      A

        for(int i=65; i<=69; i++) {
            for(int k=69; k>=i; k--) {
                System.out.print(" ");
            }
            for(int j=65; j<=i; j++) {
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }

        for(int i=69; i>=65; i--) {
            for(int k=69; k>=i; k--) {
                System.out.print(" ");
            }
            for(int j=65; j<=i; j++) {
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}
