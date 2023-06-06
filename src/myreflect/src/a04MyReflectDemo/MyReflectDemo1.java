package a04MyReflectDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取class对象
        Class clazz = Class.forName("a04MyReflectDemo.Student");
        //获取成员方法的对象  getMethods获取所有成员方法的对象(包含父类里面所有的公共方法)
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-----------------");
        //获取成员方法的对象  getDeclaredMethods获取所有成员方法的对象(不能获取父类的,可以获取本类中所有的私有和公共方法)
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("-----------------");
        //获取成员方法的对象  getDeclaredMethod获取单个成员方法的对象(公共和私有)
        Method eat = clazz.getDeclaredMethod("eat", String.class,int.class);
        System.out.println(eat);
        System.out.println("-----------------");
        //获取权限修饰符
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);
        System.out.println("-----------------");
        //获取成员方法的名字
        String name = eat.getName();
        System.out.println(name);
        System.out.println("-----------------");
        //获取方法的参数
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("-----------------");
        //获取方法抛出的异常
        Class [] exceptionTypes = eat.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        System.out.println("-----------------");
        //方法运行
        //method类中用于创建对象的方法
        //object invoke(object obj,object... args):运行方法
        //参数一:用obj对象调用方法
        //参数二:调用方法的传递参数(如果没有就不写)
        //返回值:方法的返回值 (如果没有就不写)
        Student s=new Student();
        //临时取消权限校验
        eat.setAccessible(true);
        Object o =  eat.invoke(s, "汉堡阁",12);
        System.out.println(o);
    }
}
