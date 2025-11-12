package Array.Two_D_Array;

public class Assignment {
    public static void main(String[] args){
        int [][] a ={
                {2,3,4},
                {3,4,5},
                {1,2,4}
        };
        //keep daigonal element and remove another
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a.length; j++){
//                if(i==j){
//                    System.out.print(a[i][j]+" ");
//                }
//                else{
//                    System.out.print("&"+" ");
//                }
//            }
//            System.out.println();
//        }
        //output => 2 & &
        //          & 4 &
        //          & & 4

        /// /remove dailogonal element
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i!=j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("-"+" ");
                }
            }
            System.out.println();
        }
        //output
        //- * *
        //* - *
        //* * -
    }


}
