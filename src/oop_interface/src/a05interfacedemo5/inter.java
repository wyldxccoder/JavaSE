package a05interfacedemo5;
/*接口中的静态方法的定义格式
格式:public static 返回值类型 方法名 (参数列表){}
接口中静态方法的注意事项:
静态方法只能通过接口名调用,不能通过实现类名或者对象名调用
public可以省略static不可省
 */
public interface inter {
    public abstract void method();
public static void show(){
    System.out.println("这是接口中的静态方法");
}
}
