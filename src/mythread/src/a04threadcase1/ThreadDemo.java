package a04threadcase1;
//设置线程优先级
public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(mr,"飞机");
        Thread t2=new Thread(mr,"坦克");
       t1.setPriority(10);
       t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
