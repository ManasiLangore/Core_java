package Array;

public class Max_Min {




    public static void main(String[] args){

        int arr[] = {11,22,33,44,55,66};

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i< arr.length; i++){

            if(arr[i] > max){

                max = arr[i];

            }
            if(arr[i] < min){

                min = arr[i];

            }
        }
        System.out.println("Maximum number: "+ max);
        System.out.println("Minumum number: "+ min);
    }
}
