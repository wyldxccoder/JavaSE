package day1;

public class for1 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        });
        thread.setName("线程一");
        thread.start();


    }
}

