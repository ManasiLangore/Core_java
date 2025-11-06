package Array.Two_D_Array;

public class basic {
    public static void main(String[] args){

        int[][] a = {{1,2},
                     {3,4},
                     {5,6}};
        int sum = 0;

        int row = a.length;
        int col = a[0].length;

        for(int j=0; j<col; j++){

            for(int i=0; i<row; i++){

                sum = sum + a[i][j];
//                System.out.print(a[i][j]+" ");
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
