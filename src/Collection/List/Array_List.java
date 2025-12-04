package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args){
        //syntax =>
         //List<type> list = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        //here we add numbers in list one by one
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers list: "+numbers);//output=>[10, 20, 30]


        List<String> names = new ArrayList<>();
        names.add("Manasi");
        names.add("Sanket");
        names.add("Sayali");
        System.out.println("Names list: "+names);

    }
}
