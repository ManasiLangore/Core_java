package Array.Three_D_Array;

public class Basic {
    public static void main(String[] args){
        //1D array
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c={3,6,9};

        //2D Array
        //used when there is multiple 1D array
        int[][] a1 = {
                {1,2,3},
                {4,5,6},
                {3,6,9}
        };
        int[][] b1 = {
                {1,2,3},
                {4,5,6},
                {3,6,9}
        };

        //3D Array
        //used when there is multiple 2D array
        //[] => no. of matrix's (2D array)
        //[] => no. of rows
        //[] => no. of cols
        // [2][3][3]
        int[][][] a2 = {
                {
                        {1,2,3},
                        {4,5,6},
                        {3,6,9}
                },
                {
                        {1,2,3},
                        {4,5,6},
                        {3,6,9}
                }
        };
    }
}
