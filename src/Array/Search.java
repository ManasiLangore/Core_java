package Array;

import java.sql.SQLOutput;

public class Search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,37};

        int search = 85;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.println(search);
            }
            else{
                System.out.println("number is not in array");
            }
        }

    }
}
