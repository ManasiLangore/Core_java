package Array;

import java.sql.SQLOutput;

public class Search {
    public static void main(String[] args) {

        //searching a particular element in an array
        int arr[] = {1,2,3,4,7,37};

        int search = 100;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==search){
                count++;
            }
        }
        //if number found count get increase and otherwise remain constant
        if(count == 0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }

    }
}

