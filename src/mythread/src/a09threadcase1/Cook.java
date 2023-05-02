package a09threadcase1;
//生产者
public class Cook extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                //如果吃饱了,跳出循环
                if(Desk.count==0){
                    break;
                }else {
                    //如果没吃抱并且桌子上没有面条
                    if(Desk.foodflag==0){
                        System.out.println("生产者做了一碗面条");
                    //唤醒消费者
                        Desk.lock.notifyAll();
                        Desk.foodflag=1;

                    }else {
                        //如果没吃抱并且桌子上有面条
                        try {
                            //等待消费者
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
