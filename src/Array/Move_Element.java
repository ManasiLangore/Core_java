package Array;

public class Move_Element {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = new int[a.length];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
            System.out.print(b[i] +" ");
        }
    }
}
