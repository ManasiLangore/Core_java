package Multithrading;
class task2 extends Thread{
    public void run(){
        try{
            for(int i=0; i<=3; i++) {
                //it is used to check that given thread in interrupted or not
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
        catch(Exception e){
            System.out.println("Exception is occured....!");
        }
    }
}
public class interrupt {
    public static void main(String[] args){
        task2 t1 = new task2();
        t1.start();
        //it is used to interrupt particular thread
        t1.interrupt();
        task2 t2 = new task2();
        t2.start();
    }
}
