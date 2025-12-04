package Multithrading;
class task3 extends Thread{
    public void run(){
        for(int i=0; i<=3; i++){
            //it is use to check that given thread id daemon thread or not
            System.out.println(Thread.currentThread().isDaemon());
        }
    }
}
public class deamon_thread {
    //JM => Garbage Collector => Main
    public static void main(String[] args){
        task3 t1 = new task3();
        //it is use to set as daemon thread
        t1.setDaemon(true);
        t1.start();
        task3 t2 = new task3();
        t2.start();
    }
}
