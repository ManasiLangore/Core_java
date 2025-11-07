package Array;

public class oneD_to_twoD {
    public static void main(String[] args){
        int [][] a = {{1,2,3}, {5,6,7}};
        int [] b = new int[2*3];
        int index = 0;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++) {
                b[index] = a[i][j];
                //b[0]=a[0][0]=b[0]=1
                //b[1]=a[0][1]=b[1]=2
                //b[2]=a[0][2]=b[2]=3
                //b[3]=a[1][0]=b[3]=4
                //b[4]=a[1][1]=b[4]=5
                //b[5]=a[1][2]=b[5]=6
                index++;
            }
        }
        for(int i=0; i<b.length;i++) {
            System.out.print(b[i] + " ");
        }
    }
}
