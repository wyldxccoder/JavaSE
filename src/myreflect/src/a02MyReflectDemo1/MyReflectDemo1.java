package a02MyReflectDemo1;
//反射获取构造方法
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取class对象
        Class clazz = Class.forName("a02MyReflectDemo1.Student");
        //获取构造方法   getConstructors返回所有公共构造方法对象的数组(公共)
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----------------------");
        //获取构造方法   getDeclaredConstructors返回所有构造方法对象的数组(私有和公共)
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("----------------");
        //获取构造方法   getConstructor返回单个构造方法对象 (公共)
        //获取构造方法   getDeclaredConstructor返回单个构造方法对象 (私有和公共)
        Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con);
        System.out.println("----------------");
        //获取权限修饰符
        int modifiers = con.getModifiers();
        System.out.println(modifiers);
        System.out.println("----------------");
        //获取名字
        String name = con.getName();
        System.out.println(name);
        System.out.println("----------------");
        //获取方法参数
        Parameter[] parameters = con.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("----------------");
        //临时取消权限校验
        con.setAccessible(true);
        //创建对象
        Student s = (Student) con.newInstance("张三", 23);
        System.out.println(s);
    }
}
