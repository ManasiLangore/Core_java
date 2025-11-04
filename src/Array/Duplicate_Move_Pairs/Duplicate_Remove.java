package Array.Duplicate_Move_Pairs;

public class Duplicate_Remove {
    public static void main(String[] args){
        //remove duplicate=> first way
       int a[] = {1,3,2,3};

        for(int i=0; i<a.length;i++){
           // i=0 0<4T| 1<4T| 2<4T| 3<4T | 4<4F
            int count = 0;
            for(int j=i+1; j<a.length;j++){
            //    j=1 1<4T| 2<4T| 3<4T | 4<4F
            //    j=2 2<4T| 3<4T| 4<4F
            //    j=3 3<4T| 4<4F
            //    j=4 4<4F
                if(a[i] == a[j]){
                   // 1==3F |1==2F |1==3F
                   // 3==2F |3==3T
                   // 2==3F
                    count++;
                  // 1 => count=0
                  // 3 => count=1
                  // 2 => count=0
                  // 3 => count=0 (by default value of count)
                }
            }
            if(count == 0){
                System.out.println(a[i]);
                //print => 1
                //         2
                //         3
            }
        }
    }
}
