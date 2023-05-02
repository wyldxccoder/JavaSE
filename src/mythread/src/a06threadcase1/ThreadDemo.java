package a06threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        Mythread t3=new Mythread();
        t1.setName("1");
        t2.setName("2");
        t3.setName("3");
        t1.start();
        t2.start();
        t3.start();
    }
}
