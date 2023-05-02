package a02threadcase1;
//实现Runnable接口
public class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"Hello world");
        }
    }
}
