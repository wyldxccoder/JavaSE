package Test02;

public class TestDemo1 {
    public static void main(String[] args) {
        MyRunable mr=new MyRunable();
        Thread t1=new Thread(mr,"小明");
        Thread t2=new Thread(mr,"小华");
        t1.start();
        t2.start();



    }
}
