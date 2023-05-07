package a02interfacedemo2;
//接口可以多继承,一个人有多个爹
//类不可以多继承但可以多层继承,一个人不可以有多个爹,但可以有爷爷
//类:单继承(类),多实现(接口)
//接口:多继承(接口)
public interface  inter3 extends inter1,inter2 {
    public abstract void moth3();
}
