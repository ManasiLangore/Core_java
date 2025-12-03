package Multithrading;
class first1 extends Thread{
    public void run(){
        for (int i=1; i<=3; i++){
            //it is use to konw that the current thread is in working or not
            System.out.println(Thread.currentThread().isAlive());
        }
    }
}
public class isAlive {
    public static void main(String[] args){
        first1 t = new first1();
        t.start();

    }
}
