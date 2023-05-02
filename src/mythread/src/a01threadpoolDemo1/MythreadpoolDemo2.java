package a01threadpoolDemo1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MythreadpoolDemo2 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3, //核心线程数,不能小于0
                6, //最大线程数,不能小于核心线程数,不能小于0
                60,//空闲线程最大存活时间,不能小于0
                TimeUnit.SECONDS,//时间单位    TimeUnit指定
                new ArrayBlockingQueue<>(3),//任务队列
                Executors.defaultThreadFactory(),//创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
        );
    }
}
