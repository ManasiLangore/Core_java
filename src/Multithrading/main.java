package Multithrading;

class Multithreading1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());//Thread-0
                                                             //Thread-1
    }

}
public class main {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());//main
        Multithreading1 obj = new Multithreading1();
        obj.start();//Thread-0
        Multithreading1 obj1 = new Multithreading1();
        obj1.start();//Thread-1
    }
}
