package Array.Duplicate_Move_Pairs;

public class Element_Pairs {
    public static void main(String[] args){

        //find pairs of a given array
//        int a[] ={1,2,3,4,5};
//        int count = 0;
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a.length; j++){
//                System.out.println(a[i] + " " + a[j]);
//                count++;
//            }
//        }
//        System.out.println("Number of pairs in array: "+ count);


        //remove pairs which are duplicate like=>1,1 | 1,2 & 2,1 => 1,2
        // this will give only original pairs only
        int a[] ={1,2,3,4,5};
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                System.out.println(a[i] + " " + a[j]);
                count++;
            }
        }
        System.out.println("Number of Original pairs in array: "+ count);
    }
}
