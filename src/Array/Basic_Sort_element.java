package Array;

public class Basic_Sort_element {
    public static void main(String[] args){

        //Ascending Sorting
        System.out.println("Ascending Sorting");
        int[] a= {1,4,6,8,2};
        System.out.println("Before Sorting: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" " );
        }

        for(int i=0; i<a.length; i++){    //read element
            for(int j=i+1; j<a.length; j++){ //compare element
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("After Sorting: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("Descending Sorting");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
