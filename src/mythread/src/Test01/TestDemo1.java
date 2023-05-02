package Test01;

public class TestDemo1 {
    public static void main(String[] args) {
        Mythread mt1=new Mythread();
        Mythread mt2=new Mythread();
        mt1.setName("1");
        mt2.setName("2");
        mt1.start();
        mt2.start();
    }
}
