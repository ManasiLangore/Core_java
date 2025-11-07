package Array;

public class towD_to_oneD {
    public static void main(String[] args){
        int [] a = {1,2,3,4};
        int [][] b = new int[a.length][a.length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++) {
                b[i][j] = a[i];
            }
        }
        for(int i=0; i<b.length;i++) {
            for(int j=0; j<b[i].length;j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
