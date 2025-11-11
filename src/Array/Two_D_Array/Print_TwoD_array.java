package Array.Two_D_Array;

public class Print_TwoD_array {
    public static void main(String[] args) {

        //use when no. of cols and rows are same
//        j< a.length ->2*2 2*3
        // use when no. of cols and rows are not same
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {2, 4, 6}
        };
        for (int i = 0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        int[][] b = {
            {1,2,3,4},
            {3,4,5,6}
        };
        for(int k=0; k<b.length; k++){
            for(int m=0; m<b[k].length; m++){
                System.out.print(a[k][m]);
            }
            System.out.println();
        }
    }


}
