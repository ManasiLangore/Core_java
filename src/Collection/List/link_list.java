package Collection.List;

import java.util.LinkedList;

public class link_list {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        //[10, 20, 30]

        //Linked list use same operations/methods as array list
    }
}
