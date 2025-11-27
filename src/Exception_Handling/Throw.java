package Exception_Handling;

public class Throw {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access Denied");
        }
        else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args){

        checkAge(19);
        //Access granted

         checkAge(15);
         //Exception in thread "main" java.lang.ArithmeticException: Access Denied
        //	at Exception_Handling.Throw.checkAge(Throw.java:6)
        //	at Exception_Handling.Throw.main(Throw.java:13)


    }
}
