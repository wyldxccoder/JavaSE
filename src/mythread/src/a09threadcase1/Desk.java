package a09threadcase1;
//桌子:控制生产者和消费者的执行
public class Desk {
    //桌子上是否有面条
    public static int foodflag=0;
    //消费者能吃几碗
    public static int count=10;
    //创建锁对象
    public static Object lock=new Object();
}
