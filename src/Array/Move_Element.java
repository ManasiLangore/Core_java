package Array;

public class Move_Element {
    public static void main(String[] args) {

        //simplay remove elemenet
//        int a[] = {1,2,3};
//        int b[] = new int[a.length];
//        for(int i=0; i<a.length; i++){
//            b[i] = a[i];
//            System.out.print(b[i] +" ");
//        }


        //remove duplicate elements and add original element to the another array

        int a[] = {1,3,6,1,5,3};
        int c=0;
        int index =0;
        for(int i=0; i<a.length;i++){
            int count =0;
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count == 0){
//                System.out.println(a[i]);
                c++;
            }
        }
        int b[] = new int[c];
//        System.out.println(b.length);
        for(int i=0; i<a.length;i++){
            int count =0;
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count == 0){
                b[index] = a[i];
                index++;
            }
        }
        for(int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
