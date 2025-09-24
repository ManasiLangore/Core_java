package While_loop;

public class sum_of_digit {

        public static void main(String[] args) {
            int num =200;
            int rem = 0;
            int sum = 0;
            int temp= num;

            while(num > 0) {
                rem =num % 10;
                sum = sum + rem;
                num = num/10;

            }
            System.out.println(sum);

            if(temp % sum == 0) {
                System.out.println("harshad number");
            }
            else {
                System.out.println(" not harshad number");
            }
        }
}
