package Exception_Handling;

public class Throws_try_catch {

    static int divide(int a , int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args){

        try{
            System.out.println(divide(10,0));
        }
        catch (Exception e){
            System.out.println("Can not divide by zero");
        }

    }
}
