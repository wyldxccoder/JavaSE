package a03innerclassdemo3;
//静态内部类 静态内部类是成员内部类的一种
public class Test {
    public static void main(String[] args) {
        //创建静态内部类
        Outer.Inner oi=new Outer.Inner();
        //调用非静态内部类方法
        oi.show1();
        //调用静态内部类方法
        Outer.Inner.show2();
    }
}
