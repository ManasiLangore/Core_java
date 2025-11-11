package Array.Two_D_Array;

public class Inner_Element {
    public static void main(String[] args){

        int[][] a ={
                {1,2,3,4},
                {5,6,7,8},
                {2,3,4,5},
                {5,6,7,8}
        };
        //inner element
        for(int i=1; i<a.length-1; i++){
            for(int j=1; j<a.length-1; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        //output => 67
        //          34

        //outer element
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i==0 || j==0 || i==a.length-1 || j==a.length-1){
                    System.out.print(a[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //output
        //1 2 3 4
        //5     8
        //2     5
        //5 6 7 8
    }
}
