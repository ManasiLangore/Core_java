package Exception_Handling;

public class Basic {
    public static void main(String[] args) {
//        syntax
//        try{
//            risky code
//        }
//        catch(Exception e){
//            handling exception
//        }
//        finally {
//            always run
//       }

        try{
            System.out.println(100/0);
        }
        catch (Exception e){
            System.out.println("we can't divide by zero");
        }
        //another exception
        try{
            System.out.println(100/0);
        }
        catch (Exception ArithmeticException){
            System.out.println("we can't divide by zero");
        }

        //array index out of bound
        int a[] = {1,2,3,4};
        
        try{

        } catch (Exception e) {
            System.out.println("Array index out of bound");
        }
    }
}
