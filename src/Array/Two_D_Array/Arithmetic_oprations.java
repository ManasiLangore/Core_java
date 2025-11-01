package Array.Two_D_Array;

public class Arithmetic_oprations {
    public static void main(String[] args){

        int[][] a = {{1,2},
                     {5,6}};
        int[][] b = {{1,2},
                     {5,6}};
        int[][] c = new int[2][2];

        char operator = '+';
        int add = 0;
        int sub = 0;
        int mul =1;
        int div = 1;
        for(int i=0;i<a.length;i++){

            for(int j =0; j<a[i].length; j++) {

                switch (operator){

                    case '+':{
                        c[i][j] = a[i][j] + b[i][j];
                        add = c[i][j];
                        break;
                    }
                    case '-':{
                        c[i][j] = a[i][j] - b[i][j];
                        sub = c[i][j];
                        break;
                    }
                    case '*':{
                        c[i][j] = a[i][j] * b[i][j];
                        mul = c[i][j];
                        break;
                    }
                    case '/':{
                        c[i][j] = a[i][j] / b[i][j];
                        div = c[i][j];
                        break;
                    }
                    default:
                        System.out.println("Enter valid number");




                }
            }
        }
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
