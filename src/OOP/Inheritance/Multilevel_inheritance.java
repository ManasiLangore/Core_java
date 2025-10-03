package OOP.Inheritance;
//Type of inheritance = 2)Multilevel inheritance
//in multilevel inheri there is chain of parent and child class
//it has multiple child and multiple parent

class M1{
    void get1(){
        System.out.println("M1 class");
    }
}
class M2 extends M1{
    void get2(){
        System.out.println("M2 class");
    }
}
class M3 extends M2{
    void get3(){
        System.out.println("M3 class");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args){
      M3 m1 = new M3();
      m1.get1();
      m1.get2();
      m1.get3();
    }
}
