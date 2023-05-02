package a01extends;
//1.Java只能单继承,不能多继承,但是可以多层继承(一个子类只可以有一个直接父类,可以间接父类)
//2.Java中所有的类都直接或间接继承Object类
//3.子类只能访问父类中非私有化的成员
public class Test {
    public static void main(String[] args) {
        //创建泰迪狗对象
        Teddy t=new Teddy();
        t.Eat();
        t.Touch();
        t.Drink();
        t.seeHome();
        System.out.println("-------------------");
        //创建布偶猫对象
        Ragdoll r=new Ragdoll();
        r.Eat();
        r.Drink();
        r.catchMouse();
    }
}
