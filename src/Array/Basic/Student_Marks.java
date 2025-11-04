package Array.Basic;
import java.util.Scanner;
public class Student_Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];  // Array to store 5 student marks

        // Input marks
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Print marks
        System.out.println("Marks of students:");
        for (int mark : marks) {
            System.out.println(mark + " ");
        }

        // Initialize min and max
        int min = marks[0];
        int max = marks[0];

        // Find min and max
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        // Output results
        System.out.println("Minimum mark = " + min);
        System.out.println("Maximum mark = " + max);
    }


}
