package a02threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建myrun的对象,表示多线程要执行的认务
        MyRunable r=new MyRunable();
        //创建线程对象
        Thread t1=new Thread(r,"1");
        Thread t2=new Thread(r,"1");
        //给线程设置名字
//        t1.setName("1");
//        t2.setName("2");
        //开启线程
        t1.start();
        t2.start();
    }
}
