package a05threadcase1;

public class Mythread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+i);
        }
    }
}
