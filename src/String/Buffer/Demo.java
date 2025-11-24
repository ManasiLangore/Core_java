package String.Buffer;

public class Demo {
    public static void main(String[] args){
        //string buffer=> predefined, mutable,it is not final class
        //if we want frequents changes then use string buffer
        // default value = 16 chae

        //difference between capacity and length=>
        //length=>kiti use keli
        //cpacity=>kiti use karu shaktes

        StringBuffer s1 = new StringBuffer("manasi"); //defult  =16 + ne3 =>19
        System.out.println(s1.capacity());

        //methods
        //1) .append()
        StringBuffer s2 = new StringBuffer();
        //append = concat karene
        s2.append("hefshinehefshinemhefshinehefshineabbc");//37
        System.out.println(s2.capacity());//37
        //if char are >= 16 => capacity=16
        //if char >= 16 <= 34 =>capacity=34  (formula=>16*2+2=34)
        //and char <= 34 => capacity=add manually one by one

        //we can change the default value of capacity
        StringBuffer s3 = new StringBuffer(200);
        System.out.println(s3.capacity());//200

        //2)Delete
        System.out.println(s1);//manasi
        s1.delete(0,2);// it will delete char with range
        System.out.println(s1);//nasi
        s1.deleteCharAt(0);//it will delete char at particular index
        System.out.println(s1);//asi

        //reverse
        s1.reverse();
        System.out.println(s1);//isa

        //to find last index
        System.out.println(s1.lastIndexOf("a",2));//2
        System.out.println(s1.lastIndexOf("a"));//2

    }
}
