package polymorphismtest01;

public class polymorphismtest {
    public static void main(String[] args) {
        //创建对象(多态方式)
        // Fu f=new Zi();
        Animal a=new Dog();
        //调用成员变量:编译看左边,运行也看左边
        //编译看左边:Javac编译代码的时候,会看左边的父亲有没有这个变量,如果有编译成功,没有则编译失败
        //运行也看左边:Java运行代码的时候,实际获取的就是左边父类中成员变量的值
        System.out.println(a.name);
        //调用成员方法:编译看左边,运行看右边
        //编译看左边:Javac编译代码的时候,会看左边的父亲有没有这个方法,如果有编译成功,没有则编译失败
        //运行看右边:Java运行代码的时候,实际运行的是右边子类中的方法
        a.show();
        //多态优势,使用父类作为参数,,可以接收所有子类对象,可以调用所有子类共有方法
        //a.LookHome
        //多态的缺陷,不能使用子类特有的方法,a.LookHome
       // polymorphismtest01.Dog d=(polymorphismtest01.Dog) a;//强转成子类类型,调用子类特有方法

        //强转的时候加instanceof关键字进行判断
        if(a instanceof Dog d){
            d.LookHome();
        }else if(a instanceof Cat c){
            c.catchMouse();
        }




    }
}
abstract class Animal{
    String name="这是动物";
    public abstract void show();


}
class Dog extends Animal{
    String name="这是狗";

    @Override
    public void show() {
        System.out.println("这是狗");
    }
    public void  LookHome(){
        System.out.println("狗会看家");
    }
}
class Cat extends Animal{
    String name="这是猫";

    @Override
    public void show() {
        System.out.println("这是猫");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
