package a07threadcase1;
//同步代码块
//格式:synchronized(锁){
// 操作共享数据的代码}
//细节:锁对象要唯一 , synchronized在while里面
//同步方法 格式:修饰符 synchronized  返回值类型 方法名(方法参数){
//StringBuilder 单线程使用
//StringBuffer 多线程使用(加了同步方法 更安全)
public class MyRunable implements Runnable{
    int ticket=0;
    @Override
    public void run() {

        while (true){
           if(method())break;

            }
        }

    private synchronized boolean method(){
        if(ticket==100){
           return true;
        }else {
            ticket++;
            System.out.println(Thread.currentThread().getName()+"窗口买第"+ticket+"张票");
        }
        return false;
    }
}
