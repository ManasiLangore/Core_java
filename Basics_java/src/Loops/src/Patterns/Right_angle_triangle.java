package Patterns;

public class Right_angle_triangle {
    public static void main(String[] args) {


        //right angle triangle => *
        //						  * *
        //					      * * *
        //    					  * * * *

        for(int i=1; i<=4; i++) {  //first i=1 1<=4T
            //  i++  i=2 2<=4T
            //  i++  i=3 3<=4T
            //  i++  i=4 4<=4T
            //  i++  i=5 5<=4F => code stop


            for(int j=1; j<=i; j++) {     //second j=1 1<=1T
                // j++ j=2 2<=2F

                //       j=1 1<=2T
                //  j++  j=2 2<=2T
                //  j++  j=3 3<=2F

                //	  j=1 1<=3T
                //  j++  j=2 2<=3T
                // j++  j=3 3<=3T
                //  j++  j=4 4<=3F

                //       j=1 1<=4T
                //  j++  j=2 2<=4T
                //  j++  j=3 3<=4T
                //  j++  j=4 4<=4T
                //  j++  j=5 5<=4F

                System.out.print(" * ");  //print one star

            }

            System.out.println();  //go to next line
        }


        //print =>  *
        //			* *
        //			* * *
        //			* * * *
//---------------------------------------------------------------------
        //Number pattern


//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

        //1
        //12
        //123
        //1234
        //12345
//---------------------------------------------------------------------
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

        //1
        //22
        //333
        //4444
        //55555
//---------------------------------------------------------------------
//		int count = 0;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//				count ++;
//			}
//			System.out.println();
//		}

//		1
//		12
//		123
//		1234
//		12345

//-----------------------------------------------------------------------
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			//this for loop give => 1
//			//                      12
//			//                      123
//			//                      1234
//			//                      12345
//
//			for(int k=i-1; k>=1; k--) {
//				System.out.print(k);
//			}
//			//this for loop give => 1
//			//                      21
//			//                      321
//			//                      4321
//			System.out.println();
//		}

// 			1
//			121
//			12321
//			1234321
//			123454321
//---------------------------------------------------------------------------------

//		for(int i =1; i<=5; i++) {// i=1 1<=5T|2<=5T
//			int num =i; //num =1=2
//			for(int j=1; j<=i; j++) {//j =1 1<=1T 2<=1F| 2<=2T
//				System.out.print(num + " "); //1|2
//				num = num + 5 - j;// num= 1+5-1=5|5+5-
//			}
//			System.out.println();
//		}

//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15
//----------------------------------------------------------------------------------
//		for(int i=5; i>=1; i--) {  // to revese the condition go from 5 to 1
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		12345
//		1234
//		123
//		12
//		1
//-----------------------------------------------------------------------------------
//		for(int i=1; i<=5; i++) {
//			for(int j=4; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
//    	 1
//	    12
//	   123
//	  1234
//	 12345
//-----------------------------------------------------------------------------------

        for(int i=1; i<=5; i++) {
            for(int j=4; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(k+ " "); //to make triangle shape give space
            }
            System.out.println();
        }

        for(int i=4; i>=1; i--) {
            for(int j=4; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
//	     1
//	    1 2
//	   1 2 3
//	  1 2 3 4
//	 1 2 3 4 5
//	  1 2 3 4
//	   1 2 3
//	    1 2
//	     1

    }
}
