package Array.Two_D_Array;

public class Transpose_Matrix {
    public static void main(String[] args){

        //transpose means rows become column and column becomes rows

//        int [][] a = {{1,2,3},{4,5,6}};
//
//        int [][] b = new int[3][2];
//
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a[i].length; j++){
//                b[j][i] = a[i][j];
//            }
//        }
//        System.out.println("B array : ");
//        for(int i=0; i<b.length; i++){
//            for(int j=0; j<b[i].length; j++){
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }

        //change the data tpye
        String [][] a = {{"Manasi", "Shruti", "Shafa"},
                         {"Neha", "Priya","Kajal"}};
        String[][] b = new String[3][2];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[j][i] = a[i][j];
            }
        }
        for(int i=0; i<b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
//
    }
    }


