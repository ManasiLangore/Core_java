package Array;

public class Prime_Number {
    public static void main(String[] args) {
        //find prime number from array

        int a[] = {1, 2, 3, 4, 5};
        int c=0;
        for (int i = 0; i < a.length; i++){
            int n = a[i];
            int count =0;
            for(int j=1; j<=n; j++){
                if(n%j==0){  //jar number ha divisible asel tar count++ karaycha
                    count++;
                }
            }
            if(count==2){//here why 2 because the prime number is always come only in 2 tables(1 and it's self)
                System.out.println("Prime numbers: "+n);
                c++;
            }
        }
        System.out.println("Count of prime numbers are: "+c);


    }
}
