package Array;

public class Index {
    public static void main(String[] args){

        int[] a = {23,42,55,66};
        int[] b = new int[a.length];
        int n = 0;

        for(int i=0; i<a.length; i++){  // 0<4T 1<4T 2<4T 3<4T 4<4F

            if(a[i] % 2 ==0){ //23%2==0F 42%2==0T 55%2==0F 66%2==T
                b[n] = a[i];
             // b[0] = 42
             // b[1] = 66
                n++;
            }
        }

        for(int i=0; i<a.length; i++){ // 0<4T 1<4T 2<4T 3<4T 4<4F

            if(a[i] % 2 !=0){ //23%2!=0T 42%2!=0F 55%2!=0T 66%2!=0F
                b[n] = a[i];
              //b[2] = 23
              //b[3] = 55
                n++;
            }
        }

        for (int i = 0; i < b.length; i++) {  // 0<4T 1<4T 2<4T 3<4T 4<4F
            System.out.println(b[i] + " "+ i);
//                                42      0
//                                66      1
//                                23      2
//                                55      3
        }

    }
}
