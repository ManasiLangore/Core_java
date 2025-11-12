package Array.Three_D_Array;

public class Print_three_D_A {
    public static void main(String[] args){
        int[][][] a = {
                {
                        {2,3,4},
                        {3,4,5},
                        {1,2,4}
                },
                {
                        {2,3,4},
                        {3,4,5},
                        {1,2,4}
                }
        };
        System.out.println(a[0][0][0]);//2
        System.out.println(a[0][0][1]);//3
        System.out.println(a[0][0][2]);//4
        System.out.println(a[0][1][0]);//3
        System.out.println(a[0][1][1]);//4
        System.out.println(a[0][1][2]);//5
        System.out.println(a[0][2][0]);//1
        System.out.println(a[0][2][1]);//2
        System.out.println(a[0][2][2]);//4

        System.out.println(a[1][0][0]);//2
        System.out.println(a[1][0][1]);//3
        System.out.println(a[1][0][2]);//4
        System.out.println(a[1][1][0]);//3
        System.out.println(a[1][1][1]);//4
        System.out.println(a[1][1][2]);//5
        System.out.println(a[1][2][0]);//1
        System.out.println(a[1][2][1]);//2
        System.out.println(a[1][2][2]);//4




        for(int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    System.out.print(a[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //output
    //2 3 4
    //3 4 5
    //1 2 4
    //
    //2 3 4
    //3 4 5
    //1 2 4
}
