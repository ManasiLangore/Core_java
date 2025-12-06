package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_of_ArrayList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        //here we add numbers in list one by one
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(70);
        list.add(98);

        //Printing list using for loop
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
            //output=>
            //        10
            //        20
            //        30
            //        70
            //        98
        }

        //print list in reverse order
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
            //98
            //70
            //30
            //20
            //10
        }
        //reverse list without using for loop
        Collections.reverse(list);
        System.out.println(list);
        //output=> [98, 70, 30, 20, 10]

        //print list in ascending oreder
        Collections.sort(list);
        System.out.println("Sort list: "+list);
//        [10, 20, 30, 70, 98]

        //print list in descending oreder
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sort list in descending order: "+list);
        // [98, 70, 30, 20, 10]


        //adding to array list in one
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10,20,30));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(40,50,60));
        l1.addAll(l2);
        System.out.println("Adding two array list: "+l1);
        //output=>[10, 20, 30, 40, 50, 60]


        //create list of fruits used string data type
        //1. add 5 fruits
        //2. update 2 fruits
        //3. print size of list
        //4. check list is empty or not
        //5. add 2 fruits
        //6. clear list

        ArrayList<String> fruits = new ArrayList<>();
        //1
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Orange");
        fruits.add("Blackberry");
        System.out.println("List of Fruits: "+fruits);
        //List of Fruits: [Mango, Apple, Cherry, Orange, Blackberry]

        //2
        fruits.set(1,"Pineapple");
        fruits.set(3,"Strawberry");
        System.out.println("Updated List: "+fruits);
        //Updated List: [Mango, Pineapple, Cherry, Strawberry, Blackberry]

        //3
        System.out.println("Size of list: "+fruits.size());
        //Size of list: 5

        //4
        System.out.println("Check list is Empty or not: "+fruits.isEmpty());
        //Check list is Empty or not: false

        //5
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println("Adding two fruits: "+fruits);
        //Adding two fruits: [Mango, Pineapple, Cherry, Strawberry, Blackberry, Banana, Apple]

        //6
        fruits.clear();
        System.out.println("Clear list: "+fruits);
        //Clear list: []

    }
}
