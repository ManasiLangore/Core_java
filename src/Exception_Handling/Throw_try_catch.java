package Exception_Handling;

public class Throw_try_catch {
    public static void main(String[] args){
//        try{
//            throw new NullPointerException("null");
//        }
//        catch (Exception e){
//            System.out.println("Exception cought"+e);
//            //Exception coughtjava.lang.NullPointerException: null
//        }

        int arr[] = {1,2,3};
        int index = 4;
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException(arr[4]);
            //if index = 4
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
            //	at Exception_Handling.Throw_try_catch.main(Throw_try_catch.java:16)
        }
        else{
            System.out.println(arr[index]);//3 (index=2)
        }
    }
}
