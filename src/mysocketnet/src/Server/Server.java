package Server;
//服务器
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象绑定端口(服务器)
        ServerSocket ss=new ServerSocket(10000);
        while (true) {
            //监听客户端的连接
            Socket socket = ss.accept();
            //利用多线程
//   1        MyRunable mr=new MyRunable(socket);
//           Thread t=new Thread(mr);
//           t.start();

           // 2 new Thread(new MyRunable(socket)).start();

            //利用线程池
            ThreadPoolExecutor pool=new ThreadPoolExecutor(
                    3, //核心线程数,不能小于0
                    6, //最大线程数,不能小于核心线程数,不能小于0
                    60,//空闲线程最大存活时间,不能小于0
                    TimeUnit.SECONDS,//时间单位    TimeUnit指定
                    new ArrayBlockingQueue<>(3),//任务阻塞队列
                    Executors.defaultThreadFactory(),//创建线程工厂
                    new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
            );
            pool.submit(new MyRunable(socket));

        }
    }
}
