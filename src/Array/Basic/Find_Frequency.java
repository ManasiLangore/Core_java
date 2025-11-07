package Array.Basic;

public class Find_Frequency {
    public static void main(String[] args){

        int [] a ={1,23,4,2,1,5,6,4,8,4,2,};
        int count =0 ;
        for(int i=0; i<a.length; i++){
            if(a[i]==4){
                count++;
            }
        }
        System.out.println("Count of 4 is : "+count);
    }
}
