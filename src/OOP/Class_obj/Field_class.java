package OOP.Class_obj;

class Field   //create a class
{
    int var = 10;  //field class (means we declare the variable)
    float f = 1f;
    String s = "Student";
}

public class Field_class {
    public static void main(String[] args) {


        //create object
        Field obj = new Field();
        //Class_obj.Field -> name of class
        //obj -> address of object
        //new -> create a new object and
        //      stored in heap area(memory) it is permanent
        //Class_obj.Field()-> default constructor

        // print the data of another class(Class_obj.Field) into another class(Class_obj.Field_class)
        // using object(obj)
        System.out.println(obj.var);
        System.out.println(obj.f);
        System.out.println(obj.s);

    }
}
