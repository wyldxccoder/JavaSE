package Test01;

public class Mythread extends Thread{
    static int piao=1000;
    Object lock=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (lock){
                piao--;
                System.out.println(getName()+"窗口正在销售第"+(piao+1)+"还剩电影票:"+piao);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
