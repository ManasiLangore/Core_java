package Array.Basic;

public class Even_Odd {
    public static void main(String[] args){

//        int arr[] = {11,27,11,44,95,6};
//        int esum =0;
//        int osum =0;
//        System.out.println("Even numbers :");
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2==0) {
//                System.out.println(arr[i]);
//                esum = esum + arr[i];
//            }
//        }
//
//        System.out.println("odd numbers : ");
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2!=0) {
//                System.out.println(arr[i]);
//                osum = osum + arr[i];
//            }
//        }
//
//        System.out.println("sum of even: " +esum);
//        System.out.println("sum of odd: " +osum);

        //Print even before odd and store in another  array
        int[] a = {23,45,22,66,57,88};

        int[] b = new int[a.length];

        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
//                System.out.println(a[i]);
                b[i] = a[i];
                System.out.println(b[i]);
            }
        }

        for(int i=0; i<a.length; i++){
            if(a[i] % 2 != 0){
//                System.out.println(a[i]);
                b[i] = a[i];
                System.out.println(b[i]);
            }
        }

    }
}
