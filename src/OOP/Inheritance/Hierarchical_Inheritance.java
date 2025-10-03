package OOP.Inheritance;
//Type of inheritance = 2)Hierarchical inheritance
//In Hierarchical inheritance there is 1 Parent and multiple childs
//jevde child tevde object create karavve lagtil

class Bank{
    void get1(){
        System.out.println("H1 class");
    }
}

class HDFC extends Bank{
    void get2(){
        System.out.println("H2 class");
    }
}

class SBI extends Bank{
    void get3(){
        System.out.println("H3 class");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args){
        HDFC h2 = new HDFC();
        h2.get1();  //H1 class
        h2.get2();  //H2 class

        SBI h3 = new SBI();
        h3.get1();  //H1 class
        h3.get3();  //H3 class
    }
}
