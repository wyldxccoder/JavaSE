package a03MyReflectDemo1;
//反射获取成员变量
import java.lang.reflect.Field;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //获取class对象
        Class clazz = Class.forName("a03MyReflectDemo1.Student");
        //获取成员变量的对象 getDeclaredFields获取所有成员变量的对象(公共和私有)
        //getFields获取所有成员变量的对象(公共)
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("------------");
        //获取成员变量的对象 getDeclaredField获取单个成员变量的对象(公共和私有)
        //获取成员变量的对象 getField获取单个成员变量的对象(公共和私有)
        Field age = clazz.getDeclaredField("age");
        System.out.println(age);
        System.out.println("------------------");
        //获取权限修饰符
        int modifiers = age.getModifiers();
        System.out.println(modifiers);
        System.out.println("------------------");
        //获取成员变量的名字
        String name = age.getName();
        System.out.println(name);
        System.out.println("------------------");
        //获取成员变量的数据类型
        Class<?> type = age.getType();
        System.out.println(type);
        System.out.println("------------------");
        //获取成员变量记录的值
        Student s=new Student("zhangsan",23,"男");
        //临时取消权限校验
       age.setAccessible(true);
       Object value= age.get(s);
        System.out.println(value);
        System.out.println("------------------");
        //修改对象里面成员变量的值
        age.set(s,25);
        System.out.println(s);
    }
}
