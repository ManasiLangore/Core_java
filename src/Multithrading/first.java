package Multithrading;

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
