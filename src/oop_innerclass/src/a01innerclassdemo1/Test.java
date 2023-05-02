package a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {

        //创建成员内部类对象 外部类名.内部类名 对象名=外部类对象.内部类对象(内部类不是private)
        Car.Engine CA=new Car().new Engine();
        CA.show();


    }
}
