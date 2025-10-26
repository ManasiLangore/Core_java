package Array;
import java.util.*;
public class Min {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter :");
//        int arr = sc.nextInt();

        int arr[] = {1,2,3,4,5,6};
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
