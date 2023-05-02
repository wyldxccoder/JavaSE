package a07threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunable mr=new MyRunable();
        Thread t1=new Thread(mr,"1");
        Thread t2=new Thread(mr,"2");
        Thread t3=new Thread(mr,"3");
        t1.start();
        t2.start();
        t3.start();
    }
}
