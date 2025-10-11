package OOP.Inheritance;

//class A(parent class)
class A{
    void get(){
        System.out.println("Class A");
    }
}

//this is class B(child) which inherit all properties from class A(parent)
class B extends A{
    void set(){
        System.out.println("Class B");
    }
}

//this is class C(child) which inherit all properties from class B(parent)
class C extends B{
    void show(){
        System.out.println("Class c");
    }
}

public class inheritance_1 {
    public static void main(String[] args){

        //we only call the C class because he has all class properties
        //i.e Class A is parent then create class B and access class A
        //    now create class C which access class B( + class A)
        // print the class which has all properties of another object
        C t1 = new C();

        t1.get(); // call class A get() method
        t1.set(); // call class B set() method
        t1.show();// call class C show() method
    }
}
