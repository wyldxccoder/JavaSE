package a04interfacedemo4;
/*接口中默认方法的定义格式
格式:public default 返回值类型 方法名 (参数列表){}
接口中默认方法的注意事项:
1.默认方法不是抽象方法,所以不被强制要求重写,重写的时候去掉defunct关键字
2.public 可以省略,defunct不能省略
3.如果实现了多个接口,多个接口中存在相同名字的默认方法,子类就必须对该方法重写
 */

public interface interB {
    public abstract void method();
    public default void show(){
        System.out.println("interB中的接口的默认方法");
    }
}
