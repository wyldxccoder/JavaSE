package Test04;

import java.util.Random;

public class Mythread extends Thread{
    static double meony=100;
    static int count=3;
    static final double MIN=0.01;
    @Override
    public void run() {
        synchronized (Mythread.class){
            if(count==0){
                System.out.println(getName()+"没有强到红包");
            }else {
                double prize=0;
                if(count==1){
                    prize=meony;
                }else {
                    Random r=new Random();
                    prize = r.nextDouble(meony-(count-1)*MIN);
                if(prize<MIN) {
                    prize = MIN;
                }
                }
                meony=meony-prize;
                count--;
                System.out.print(getName()+"抢到了");
                System.out.printf("%.2f",prize);
                System.out.println("元");
            }

        }
    }
}
