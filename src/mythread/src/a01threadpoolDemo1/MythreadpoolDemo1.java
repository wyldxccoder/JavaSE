package a01threadpoolDemo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MythreadpoolDemo1 {
    public static void main(String[] args) {
        //获取线程池对象
        //无上限
        ExecutorService pool = Executors.newCachedThreadPool();
//  有上限      ExecutorService pool = Executors.newFixedThreadPool(3);
        //提交任务
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        //销毁线程池
        pool.shutdown();
    }
}
