package Multithrading;
class f extends Thread{
    public void run(){
        for(int i=0; i<=3; i++){
            //it is used to know the classloader of given thread
            System.out.println(Thread.currentThread().getContextClassLoader());
        }
    }
}
public class get_context_class_loader {
    public static void main(String[] args){
        f o = new f();
        o.start();
    }
}
