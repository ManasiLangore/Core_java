package Collection.Queue;

import java.util.PriorityQueue;

//1) priority queue is homogenous concept
//   means we can store only similar type of data
//2) priority queue allow duplicates
//3) priority queue doesn't allow null insertion

public class priority_queue {
    public static void main(String[] args){
        //here we used object because it is parent of all data structure(int,string....)
        PriorityQueue<Object> p = new PriorityQueue<>();
        //here we can add only similar type of data
        p.add(100);
        p.add(45);
        p.add(1);
        p.add(78);
        p.add(11);
        p.add(9);
        System.out.println(p);
        //output=> [1, 11, 9, 100, 78, 45]
        //this is the min heap data structure tree(ascending)
        //       1
        //  11       9
        //100 78   45



    }
}
