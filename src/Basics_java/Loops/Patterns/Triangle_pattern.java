package Basics_java.Loops.Patterns;

public class Triangle_pattern {
    public static void main(String[] args) {


//	     *
//	    ***
//	   *****
//	  *******
//	 *********



        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print("-");      //     ----
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

// character pattern
//	      A
//	     A B
//	    A B C
//	   A B C D
//	  A B C D E

        for(int i=65; i<=69; i++) {//outer loop 65---69

            //i=66   66<=69
            for(int k=69; k>=i; k--) {//space loop iterate eache row for 5 times
                //k=69  69>=66

                System.out.print(" ");
            }
            for(int j=65; j<=i; j++) {// printing char
                //j=66  66<=65
                System.out.print((char) j + " ");
            }
            System.out.println();
        }

//	      A
//	     A A
//	    A B A
//	   A B C A
//	  A B C D A


    }
}
