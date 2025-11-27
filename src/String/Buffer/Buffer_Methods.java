package String.Buffer;

public class Buffer_Methods {
    public static void main(String[] args){
        //difference between capacity and length=>
        //length=>kiti use keli
        //cpacity=>kiti use karu shaktes

        //methods
        //1).capacity()
        StringBuffer s1 = new StringBuffer("manasi"); //defult  =16 + ne3 =>19
        System.out.println(s1.capacity());

        //2) .append()
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

        //3)Delete
        System.out.println(s1);//manasi
        s1.delete(0,2);// it will delete char with range
        System.out.println(s1);//nasi
        s1.deleteCharAt(0);//it will delete char at particular index
        System.out.println(s1);//asi

        //4)reverse
        s1.reverse();
        System.out.println(s1);//isa

        //5)to find last index
        System.out.println(s1.lastIndexOf("a",2));//2
        System.out.println(s1.lastIndexOf("a"));//2

        //6).setLength()
        StringBuffer s4 = new StringBuffer();
        s4.append("HelloHello");
        System.out.println("before setting length: "+s4);
        s4.setLength(5);
        System.out.println("After setting length: "+s4);

        //7).replace()
        s4.replace(0,2,"abcde");
        System.out.println("Repalcing char: "+s4);

        //8).insert()
        System.out.println(s1);
        s1.insert(0,"ma");
        System.out.println("Inserting char: "+s1);

        //9).subsequence()
        System.out.println(s4);
        System.out.println(s4.subSequence(0,5));

    }
}
