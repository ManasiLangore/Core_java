package Array.Two_D_Array;

public class daigonal {
    public static void main(String[] args){

        int a[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}  };

        //left to right
//        for(int i=0; i<a.length; i++){
//            System.out.print("Right to left : "+a[i][i] +" ");
//        }

//        for(int i=0; i<a.length; i++){
//            for(int j =0; j>a[i].length; j--){
//                System.out.println(a[i][j]);
//            }
//        }
        //output => 1
        //          5
        //          9

        //right to left
        for(int i=0; i<a.length; i++){
            System.out.println(a[i][a.length-1-i]);
        }
        //output => 3
        //          5
        //          7
    }
}
