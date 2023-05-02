package a10threadcase1;
//不用加锁 阻塞队列里面有锁
import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
