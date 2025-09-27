public class Practice {
    public static void main(String[] args) {


        //Que 1) number is grater , euquale, smaller

//		int x = 10;
//		if(x > 10) {
//			System.out.println("Greater");
//		}
//		else if(x == 10) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("Smaller");
//		}
        //ans-equal


        //Que 2) ternary operator twist

//		int a = 5, b = 10;
//		int result = (a > b) ? (a - b) : (b - a);
//		System.out.println(result);

//		//ans-5

        //Que 3)Nested if puzzales

//		int num = -5;
//		if(num > 0) {
//			if(num % 2 == 0) {
//				System.out.println("Postive even");
//			}
//			else {
//				System.out.println("Postive odd");
//			}
//		}
//		else {
//			System.out.println("Negative ");
//		}
        //output = Negative

        //Que4) Switch without breaks
//		int day = 3;
//		switch (day) {
//		case 1 : System.out.println("Monday");
//		case 2 : System.out.println("Tuesday");
//		case 3 : System.out.println("Wednesday");
//		case 4 : System.out.println("Thursday");
//		case 5 : System.out.println("Firday");
//		case 6 : System.out.println("Sturday");
//		case 7 : System.out.println("Sunday");
//		default : System.out.println("Envalid input");
//		}
//		//Wednesday
        //Thursday
        //Firday
        //Sturday
        //Sunday
        //Envalid input  (becuse we do not use break statement therfore it execute all)


        //Que5) Switch with string
//		String lang = "Java";
//		switch(lang) {
//			case "Python" : System.out.println("Snake");
//			break;
//			case "Java" : System.out.println("Coffee");
//			break;
//			default : System.out.println("Unknown");
//		}
        //output = Coffee

        //Ues 6) While loop puzzle
//		int i = 1;
//		while(i <= 5) {
//			i++;
//			System.out.println(i);
//		}
        //output = 2
        //         3
        //  		   4
        //		   5
        //		   6


        //que 7) Do-While vs while
//		int n = 5;
//		do {
//			System.out.println("Number = " + n);
//			n--;
//		}
//		while(n>5);
        // output = Number = 5


//Que 8) Write  a program to check if a number is even or odd without
        //   using module operator

//		int num = 52;
//		if(num / 2 * 2 == num) {
//			System.out.println("Number is even");
//		}
//		else {
//			System.out.println("Number is odd");
//		}
//


        //   find the largest of three numbers using only if-else (avoid && or ||).
        //nested if-else
//		int a = 111, b = 22, c = 3;
//		if(a>b) {
//			if(a>c) {
//				System.out.println("A is largest");
//			}
//			else {
//				System.out.println("C is largest");
//			}
//		}
//		else {
//			if(b>c) {
//				System.out.println("B is largest");
//			}
//			else {
//				System.out.println("C is largest");
//			}
//		}
//

        //   write a program that takes two numbers and an operator (+,-,*,/) as input
        //   and  perform the calculation using switch case.

//		Scanner in = new Scanner(System.in);
//
//		System.out.print("Enter num1 : ");
//		int num1 = in.nextInt();
//
//		System.out.print("Enter Oprator : ");
//		char opr = in.next().charAt(0);
//
//		System.out.print("Enter num2 : ");
//		int num2 = in.nextInt();
//
//		switch(opr) {
//
//			case '+' : System.out.println("Addition is : " + (num1+num2));
//			break;
//			case '-' : System.out.println("Substraction is : " + (num1-num2));
//			break;
//			case '*' : System.out.println("Multiplication is : " + (num1*num2));
//			break;
//			case '/' : System.out.println("Division is : " + (num1/num2));
//			break;
//			default : System.out.println("Input is invalid");
//		}


        //   write a program to check whether a given year is a leap year or not using
        //   conditional statement.

//		int year = 2000;
//		if ( year % 4 == 0) {
//			System.out.println("Year is leap");
//		}
//		else {
//			System.out.println("Year is not leap");
//		}


        //   Accept marks of a student and print grade according to the following rules:
        //   90-100 -> A
        //   80-89 -> B
        //   60-79 -> C
        //   40-59 -> D
        //   <40 -> fail

//		int marks = 10;
//		if(marks >= 90) {
//			System.out.println("Grade is A");
//		}
//		else if(marks >= 80) {
//			System.out.println("Grade is B");
//		}
//		else if(marks >= 70) {
//			System.out.println("Grade is C");
//		}
//		else if(marks >= 40) {
//			System.out.println("Grade is D");
//		}
//		else {
//			System.out.println("fail");
//		}


        //covert number into binary no using if-else

//		int num =001;
//		int rem =0;
//		if(num == 0) {
//			System.out.println("0");
//		}
//		else if(num == 1) {
//			System.out.println("1");
//		}
//		else {
//			String binary = "";
//			while (num > 0) {
//				rem = num % 2;
//				binary = rem + binary;
//				num = num / 2;
//			}
//			System.out.println("binary : " + binary);
//		}

    }
}
