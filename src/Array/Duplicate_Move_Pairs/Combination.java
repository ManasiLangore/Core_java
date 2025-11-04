package Array.Duplicate_Move_Pairs;

public class Combination {
    public static void main(String[] args){

        int a[] ={1,3,5,1,5};
        int size =0;

        //remove duplicates
        for(int i=1;i<a.length; i++){
            int count =0;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count ==0){
//                System.out.println(a[i]);
                size++;
            }
        }

        //move original elements to b[] array
        int b[] = new int[size];
//        System.out.println(b.length);
        int index =0;
        for(int i=1;i<a.length; i++){
            int count =0;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count ==0){
                b[index] = a[i];
                index++;
            }
        }
        for(int i=0; i<b.length; i++){
//            System.out.println(b[i]);
        }

        //find pairs form b[] array
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++ ){
                System.out.println(b[i] + " "+ b[j]);
            }
        }
    }
}
