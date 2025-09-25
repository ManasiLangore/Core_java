import java.util.*;

class Student{
    int id = 1;
    String s = "Manasi";
}

class Student1{
    int id;
}

public class Multi_object_class {

    public static void main(String[] args) {

        //object 1
        Student obj1 = new Student();
        System.out.println("Object 1 = " +obj1.id);

        //object2
        Student obj2 = new Student();
        System.out.println("Object 2 = " +obj2.s);

        //object3
        Student obj3 = new Student();
        System.out.println("Object 3 = " +obj3.id);

        //object4
        Student obj4 = new Student();
        System.out.println("Object 4 = " +obj4.s);

        //object 5 Student obj1 = new Student();
        Student obj5 = new Student();
        System.out.println("Object 5 = " +obj5.id);


        //

        Student1 ob1 = new Student1();
        ob1.id = 101;
        System.out.println(ob1.id);

        Student1 ob2 = new Student1();
        ob2.id = 102;
        System.out.println(ob2.id);

        //adding Scanner
        Student1 ob3 = new Student1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers :");
        ob3.id = sc.nextInt();
        System.out.println(ob3.id);

        //putting object data in new variable
        Student1 ob4 = new Student1();
        int x = ob4.id = 104;
        System.out.println(x);


    }
}
