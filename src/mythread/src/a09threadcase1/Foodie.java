package a09threadcase1;
//消费者
public class Foodie extends Thread{

    @Override
    public void run() {
     while (true){
         synchronized (Desk.lock){
             //如果吃饱了,跳出循环
             if(Desk.count==0){
                 break;
             }else {
                 //如果没吃抱并且桌子上有面条
                if(Desk.foodflag==1){
                    Desk.count--;
                    System.out.println("消费者正在吃面还能吃"+Desk.count+"碗");
                    //唤醒生产者
                    Desk.lock.notifyAll();
                    Desk.foodflag=0;

                }else {
                    //如果没吃抱并且桌子上没有面条
                    try {
                        //等待生产者
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
