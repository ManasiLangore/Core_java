class Task{
    int id = 353;
}

public class Task_object {
    public static void main(String[] args) {

        //object 1
        Task t1 = new Task();
        System.out.println(t1.id);
        //fact
        double fact = 1;
        for(int i=1; i<=t1.id; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of a number :" + fact);

        //object 2
        Task t2 = new Task();
        System.out.println(t2.id);
        //sum of digit
        int rem;
        int sum = 0;
        while(t2.id > 0) {
            rem = t2.id % 10;
            sum = sum + rem;
            t2.id = t2.id / 10;
        }
        System.out.println("Sum of a number :" + sum);

        //object 3
        Task t3 = new Task();
        System.out.println(t3.id);
        //palindrom
        int rem1;
        int rev = 0;
        int temp = t3.id;
        while(t3.id>0) {
            rem1 = t3.id % 10 ;
            rev = rev *10 + rem1;
            t3.id = t3.id / 10;

        }
//		System.out.println(rev);
        if(temp == rev) {
            System.out.println("Nunber is palindrome ");
        }
        else {
            System.out.println("Nunber is not palindrome ");
        }

    }
}
