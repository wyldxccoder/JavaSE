package Test02;

public class MyRunable implements Runnable{
     int gift=100;
    Object lock=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+"送出了第个"+gift+"礼物");
                gift--;
                if(gift<10){
                   break;
                }
            }
        }
    }
}

