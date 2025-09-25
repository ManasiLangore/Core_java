package Patterns;

public class Half_pyramid {
    public static void main(String[] args) {


        //half pyramid => 1
        //				  1 2
        //				  1 2 3
        //				  1 2 3 4

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int ch = 'A';
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((char )ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
