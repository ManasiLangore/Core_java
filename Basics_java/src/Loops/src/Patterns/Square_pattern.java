package Patterns;

public class Square_pattern {

    public static void main(String[] args) {

        //

        //printing Square patterns => * * * * *
        //							  * * * * *
        //							  * * * * *
        // 							  * * * * *
        //							  * * * * *

        //method 1

//		for(int i=1; i<=5; i++) {
//
//			for(int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("*");
//		}


        //method 2
        for(int row=1; row<=5; row++) {
            System.out.println(" * * * * *");
        }
    }
}
