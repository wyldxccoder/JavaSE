package a01threadcase1;
//继承Thread
public class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"Hello world");
        }

    }
}
