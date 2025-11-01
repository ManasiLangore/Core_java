package Array.Two_D_Array;

public class Max {
    public static void main(String[] args){

        int a[][] ={{1,2,3}, {4,5,6}};
        int max = a[0][0];

        for(int i=0;i<a.length;i++){

            for(int j =0; j<a[i].length; j++) {

                if (a[i][j] > max) {
                    max = a[i][j];
                }
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("Max no: "+max);

        for(int i=0; i<a.length;i++){
            for(int j =0; j<a[i].length; j++ ){
                System.out.print(a[i][j]+" ");
            }

        }
    }
}
