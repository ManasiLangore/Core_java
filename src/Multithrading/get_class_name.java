package Multithrading;
class name extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            //it is used to find current class of given thread
            System.out.println(Thread.currentThread().getClass());
            //output=>
            //class Multithrading.name
            //class Multithrading.name
            //class Multithrading.name
        }
    }
}
public class get_class_name {
    public static void main(String[] args){
        name n = new name();
        n.start();
    }
}
