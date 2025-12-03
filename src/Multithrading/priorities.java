package Multithrading;
//priority
//in multithreading we have 10 priority only
//in that 1-> min priority
//        2-> norm priority - default
//        10-> max priority
class task1 extends Thread{
    public void run(){
        for(int i=0; i<=3; i++){

            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
public class priorities {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getPriority());
        //default prio - 5

        //we can change the default priority
        Thread.currentThread().setPriority(3);
        System.out.println(Thread.currentThread().getPriority());
        //if we change the default priority of main thread  then
        //automatically others thread priority also change

        task1 t1 = new task1();
        t1.start();//default prio - 5
        //after changing main's default prio then t1's prio - 3
        task1 t2 = new task1();
        t2.start();//default prio - 5
        //after changing main's default prio then t2's prio - 3

        task1 t3 = new task1();
        t3.setPriority(1);
        t3.start();//t3's  prio - 1

        task1 t4 = new task1();
        t4.setPriority(Thread.MAX_PRIORITY);
        t4.start();//t4's prio - 10
    }
}
