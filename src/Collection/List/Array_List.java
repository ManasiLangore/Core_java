package Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        //Printing list using for loop
        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
            //output=>
            //        10
            //        20
            //        30
        }

        //print list in reverse order
        for(int i=numbers.size()-1; i>=0; i--){
            System.out.println(numbers.get(i));
            //30
            //20
            //10
        }
        //reverse list without using for loop
        Collections.reverse(numbers);
        System.out.println(numbers);
        //output=> [30, 20, 10]
    }
}
