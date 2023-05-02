package a02innerclassdemo2;
//成员内部类
public class Test {
    public static void main(String[] args) {
        //创建成员内部类的对象
        //外部类名.内部类名 对象名=外部类对象.内部类对象(内部类不是privat)
        Outer.Inner oi=new Outer().new Inner();
        //调用内部类中的对象
        oi.show();
    }
}
