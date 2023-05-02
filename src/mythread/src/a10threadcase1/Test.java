package a10threadcase1;

import java.util.concurrent.ArrayBlockingQueue;
//阻塞实现等待唤醒机制
public class Test {
    public static void main(String[] args) {
        //阻塞队列
        ArrayBlockingQueue <String>queue=new ArrayBlockingQueue<>(1);
        Cook c=new Cook(queue);
        Foodie f=new Foodie(queue);
        c.start();
        f.start();
    }
}
