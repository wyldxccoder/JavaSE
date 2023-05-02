package Test04;

public class TesrDemo1 {
    public static void main(String[] args) {
        Mythread mt1=new Mythread();
        Mythread mt2=new Mythread();
        Mythread mt3=new Mythread();
        Mythread mt4=new Mythread();
        Mythread mt5=new Mythread();
        mt1.setName("ddd");
        mt2.setName("ccc");
        mt3.setName("xxx");
        mt4.setName("www");
        mt5.setName("lll");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}
