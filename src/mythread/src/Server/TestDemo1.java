package Server;

import java.util.concurrent.ExecutionException;

public class TestDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRunable mr=new MyRunable();
        Thread t1=new Thread(mr,"线程1");
        Thread t2=new Thread(mr,"线程2");
        t1.start();
        t2.start();
    }
}
