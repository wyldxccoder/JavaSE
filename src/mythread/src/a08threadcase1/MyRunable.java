package a08threadcase1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable{
      int ticket=0;
      //加静态,保证用同一个锁
    //创建锁的对象,实现ReentrantLock接口
   static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
//开启锁
            lock.lock();
            try {
                if(ticket<100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"窗口"+"正在买第"+ticket+"票");
                }else {
                    break;
                }
                //finally保证最后一次执行
            } finally {
                //关闭锁
                lock.unlock();
            }
        }

    }
}
