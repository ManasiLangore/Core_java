package Array.Duplicate_Move_Pairs;

public class Element_Pairs {
    public static void main(String[] args){

        //logic to make pairs of any number of element =>
        //jevde aplyala pairs madhe element have astil tevde aplyala for loop gyave lagtil


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
//        int a[] ={1,2,3,4,5};
//        int count = 0;
//        for(int i=0; i<a.length; i++){
//            for(int j=i+1; j<a.length; j++){
//                System.out.println(a[i] + " " + a[j]);
//                count++;
//            }
//        }
//        System.out.println("Number of Original pairs in array: "+ count);
        //output => 1 2
                  //1 3
        //          1 4
        //          1 5
        //          2 3
        //          2 4
        //          2 5
        //          3 4
        //          3 5
        //          4 5


        //now pairs of three elements
//        int a[]={1,2,4,5};
//        //first element for loop
//        for(int i=0; i<a.length;i++ ){
//            //second element for loop
//            for(int j=i+1; j<a.length; j++){
//                //third element for loop
//                for(int k=j+1; k<a.length; k++){
//                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
//                }
//            }
//        }
        //output => 1 2 4
        //          1 2 5
        //          1 4 5
        //          2 4 5


        //task =>
        int a[]={1,2,4,5};
        int sum =0;
        //first element for loop
        for(int i=0; i<a.length;i++ ){
            //second element for loop
            for(int j=i+1; j<a.length; j++){
                //third element for loop
                for(int k=j+1; k<a.length; k++){
                    sum=a[i]+a[j]+a[k];
                    if(sum<=8) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k] + " : " + sum);
                    }
                }
            }
        }
    }
}
