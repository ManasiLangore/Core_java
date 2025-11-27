package Multithrading;

class Multithreading extends Thread{
    public void run(){
        System.out.println("Running predefined method in thread class");
    }

}
public class Class_Extends {
    public static void main(String[] args){
        Multithreading obj = new Multithreading();
        obj.run();//Running predefined method in thread class
        obj.run();//Running predefined method in thread class

        obj.start();
        //output=>Running predefined method in thread class
        obj.start(); //why if we run predefined method second time it  show an error
                     //because predefined methods run only time
        //output=>Exception in thread "main" java.lang.IllegalThreadStateException
        //	at java.base/java.lang.Thread.start(Thread.java:1389)
        //	at Multithrading.Class_Extends.main(Class_Extends.java:12)


    }
}
