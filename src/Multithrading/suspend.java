package Multithrading;
class task extends Thread{
    public void run(){
        for(int i=0; i<=3; i++){

            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class suspend {
    public static void main(String[] args){
        task t = new task();
        t.start();
        //it is used to suspend particular thread
        //(will stay at waiting area)
//        t.suspend();

        //it is use to resume those threads which are suspended
//        t.resume();

        //it is use to stop the working of particular thread
//        t.stop();

        task t1 =new task();
        t1.start();
    }
}
