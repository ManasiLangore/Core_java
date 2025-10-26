package Array;

public class Even_Odd {
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6};
        int e;
        int o;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println("number is even : "+arr[i]);
            }
            else{
                System.out.println("number is odd : "+arr[i]);
            }
        }

    }
}
