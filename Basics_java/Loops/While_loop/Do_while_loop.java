package Basics_java.Loops.While_loop;

public class Do_while_loop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		int i=1;
//		do {
//			System.out.println("Hello");
//			i++;
//		}
//		while(i<=5);


        //print 1 to 10
        int i =1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=10);


        //print 10 to 1
        int j = 10;
        do {
            System.out.println(j);
            j--;
        }
        while(j>=1);


        //print table of 5
        int k =1;
        do {
            System.out.println("5 * " + k + " = " + k*5);
            k++;
        }
        while(k<=10);

    }
}
