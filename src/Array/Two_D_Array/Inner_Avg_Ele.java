package Array.Two_D_Array;

public class Inner_Avg_Ele {
    public static void main(String[] args){


        int[][] a ={
                {1,2,3,4},
                {5,6,7,8},
                {2,3,4,5},
                {5,6,7,8}
        };

        //inner element
        int sum =0;
        int c=0;
        for(int i=1; i<a.length-1; i++){
            for(int j=1; j<a.length-1; j++){
                System.out.print(a[i][j]+" ");
                sum = sum + a[i][j];
                c++;
            }
            System.out.println();
        }
        System.out.println("sum = "+sum);
        System.out.println("count of inner ele = "+c);
        System.out.println("avg = "+sum/c);


    }
}
