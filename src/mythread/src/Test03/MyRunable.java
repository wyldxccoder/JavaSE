package Test03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable {

Object lock=new Object();
static int i;
static Lock lovk=new ReentrantLock();
    @Override
    public void run() {


        for ( i = 0; i < 100; i++) {
            lovk.lock();

            if(i/2!=0) {
                System.out.println(Thread.currentThread().getName() + " " + i);

            }
            lovk.unlock();
        }
    }

}


