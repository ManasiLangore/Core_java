package String.Builder;

public class Builder_Methods {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder();//in this parenthesis we can manually put capacity
        s1.append("hello");
        StringBuilder s2 = new StringBuilder();
        s2.append("ManasiLangoreTEComputer");

        //1)capacity
        System.out.println(s1.capacity());//16
        System.out.println(s1.length());//5
        System.out.println(s2.capacity());//34
        System.out.println(s2.length());//23(he jeva 34 exide karel teva manually increase hoil capacity)

        //2)replace
        System.out.println(s1.replace(2,4,"mm"));//hello=>hemmo

        //3)delete
        //particular char
        s1.deleteCharAt(3);
        System.out.println(s1);//hemmo=>hemo
        //delete in particular range
        s2.delete(13,34);
        System.out.println(s2);//ManasiLangoreTEComputer=>ManasiLangore

        //4)reverse
        System.out.println(s1.reverse());//hemo=>omeh

        //5)equals
        StringBuilder s3 = new StringBuilder();
        s3.append("ManasiLangore");
        if(s2.equals(s3)){//ManasiLangore.equals(ManasiLangore)
            System.out.println("same");
        }else{
            System.out.println("not same");//not same
        }

        //6)insert
        System.out.println(s1.insert(3,"s"));//omeh=>omesh

        //7)setlength
        s3.setLength(6);
        System.out.println(s3);//ManasiLangore=>Manasi

        //8)last index of char
        System.out.println(s3.lastIndexOf("a"));//Manasi=>3

        //9)subsequence
        System.out.println(s3.subSequence(0,5));//Manasi=>Manas

        //10)substring
        System.out.println(s2.substring(0,6));//ManasiLangore=>Manasi
    }
}
