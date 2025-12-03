package Multithrading;
class test extends Thread{
    public void run(){
        for(int i=0; i<=3; i++){
            //it is used to know that the count of current active threads
            System.out.println(Thread.currentThread().activeCount());
        }
    }
}
public class active_count {
    public static void main(String[] args){
        test t1= new test();
        t1.start();
        try{
            //it is used to convert from non-sync to sync
            //can fix the  output
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        test t2 = new test();
        t2.start();
    }
}
