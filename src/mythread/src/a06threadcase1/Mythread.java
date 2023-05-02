package a06threadcase1;
//同步代码块
//格式:synchronized(锁){
// 操作共享数据的代码}
//细节:锁对象要唯一 , synchronized在while里面
public class Mythread extends Thread {
  static   int ticket=0;
    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (Mythread.class){
                if(ticket<1000){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName()+"窗口"+"正在买第"+ticket+"票");
                }else {
                    break;
                }
            }
        }

    }
}
