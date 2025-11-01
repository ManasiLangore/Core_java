package Array;

public class Remove_Element {
    public static void main(String[] args) {
        //remove particular element from array
        //non-primitive ->user defined
        int[] a = {1,2,3,4};  //(fix)contigeous memo

        for(int i=0; i<a.length; i++){

            if(a[i]==3){  //remove an element 3 for temporary
                //actual it is not deleted from an array

            }

            else{
                System.out.println(a[i]);//display array
            }
        }

        //search the element if present then remove that element
        int[] arr = {12, 34,56,78,89,58,78};

        int search =12;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
                count++;
            }
        }
        if(count == 0 ){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
            for(int i=0; i<arr.length; i++){
                if(arr[i] != search){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
