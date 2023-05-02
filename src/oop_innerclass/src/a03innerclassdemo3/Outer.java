package a03innerclassdemo3;
//静态内部类 静态内部类是成员内部类的一种
public class Outer {
    static class Inner{
        public void show1(){
            System.out.println("非静态的方法被调用了");
        }
        public static void show2(){
            System.out.println("静态的方法被调用了");
        }
    }
}
