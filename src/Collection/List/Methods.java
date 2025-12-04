package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);//[10, 20, 30, 40, 50]

        //methods
        //1) get
        //we can access particular element in list
        System.out.println("first element : "+numbers.get(1));//20

        //2) set
        //we set particular element in list
        numbers.set(1,50);
        System.out.println("Updated List: "+numbers);//[10, 50, 30, 40, 50]

        //3) remove
        //it remove the particular element in list
        numbers.remove(1);
        System.out.println("remove element at index 1: "+numbers);//[10, 30, 40, 50]

        //4)size
        // it will return the size of list
        System.out.println("Size of list: "+numbers.size());//4

        //5)contains
        //it will tell the element is present in list or not
        System.out.println("is 20 present in list or not: "+numbers.contains(20));//false

        //6)isEmpty
        //it will return list is empty or not
        System.out.println("List is empty or not: "+numbers.isEmpty());//false

    }
}
