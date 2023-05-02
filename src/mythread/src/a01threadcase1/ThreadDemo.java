package a01threadcase1;
//并发,多条线程交替执行
//并行,多条线程同时进行
public class ThreadDemo {
    public static void main(String[] args) {
        //创建线程对象
        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        //给线程设置名字
        t1.setName("1");
        t2.setName("2");
        //开启线程
        t1.start();
        t2.start();
    }
}
