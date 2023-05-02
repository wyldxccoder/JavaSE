package a01interfacedemo1;
//接口方法默认是抽象方法(在子类中必须重写)
//接口就是一些行为的规则,是行为的抽象(游泳,说英语)
public interface Swim {
    int a=10;//默认 public static final
    public abstract void swim();//默认 public abstract ,可以省略不写
}
