package a03threadcase1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建Callable的对象(表示多线程要执行的任务)
        MyCallable mc=new MyCallable();
        //创建FutureTask的对象(管理多线程运行的结果)
        Future<Integer>f=new FutureTask<>(mc);
//        创建线程
        Thread t1=new Thread((Runnable) f);
        //启动线程
        t1.start();
        //获取多线程的结果
        Integer result = f.get();
        System.out.println(result);
    }
}
