package Multithrading;

//Methods in multithreading
//run
//start
//currentThread
//getname
//setname
//isAlive
//sleep
//join
//active count
//stop=> particulate  htread ch kam stop karn
//suspend
//resume
//get class
//get priority
//set priority
//interrupt
//isinterrupted
//getContextClassLoader
//setDaemon
//isDaemon
class test1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class first {
    public static void main(String[] args) {
        System.out.println("Main "+Thread.currentThread().getName());
        test1 t1 = new test1();
        t1.setName("First");
        t1.start();
    }
}
