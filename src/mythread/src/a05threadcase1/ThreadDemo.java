package a05threadcase1;
//守护线程 当其他线程结束后,守护线程陆续结束
public class ThreadDemo {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1() ;
        Mythread2 t2=new Mythread2() ;

        t1.setName("女神");
        t2.setName("备胎");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
