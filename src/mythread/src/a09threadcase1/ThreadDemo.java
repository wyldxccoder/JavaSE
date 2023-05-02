package a09threadcase1;
//生产者消费者实现等待唤醒机制
public class ThreadDemo {
    public static void main(String[] args) {
        Cook c=new Cook();
        Foodie f=new Foodie();
        c.start();
        f.start();
    }
}
