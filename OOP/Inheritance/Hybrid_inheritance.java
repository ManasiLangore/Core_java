package OOP.Inheritance;
//Type of inheritance = 5)Hybrid inheritance
//it is inheritance in which more than two combination of inheritance occur
//probably hybrid inheritance is not used in inheritance it is mostly used in interface

//in  this example hybrid inheri = single inheritance + hierarchical inheritance
//1)single inheritance
class Single{
    void get1(){
        System.out.println("Single Inheritance Parent");
    }
}
class Single_C extends Single{
    void get2(){
        System.out.println("Single Inheritance Child");
    }
}

//2)hierarchical inheritance
class Hierarchical extends Single_C{
    void get3(){
        System.out.println("Hierarchical parent extends from Single child");
    }
}
class Hierarchical1 extends Single_C{
    void get4(){
        System.out.println("Hierarchical second parent extends from Single child");
    }
}
public class Hybrid_inheritance {
    public static void main(String[] args){

        Hierarchical h3 = new Hierarchical();
        h3.get1();  //Single Inheritance Parent
        h3.get2();  //Single Inheritance Child
        h3.get3();  //Hierarchical parent extends from Single child

        Hierarchical1 h4 = new Hierarchical1();
        h4.get1();  //Single Inheritance Parent
        h4.get2();  //Single Inheritance Child
        h4.get4();  //Hierarchical second parent extends from Single child

    }
}
