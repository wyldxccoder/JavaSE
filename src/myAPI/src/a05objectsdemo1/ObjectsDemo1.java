package a05objectsdemo1;
//Objects 是一个对象工具类,提供一些操作对象的方法
import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("李四",19);
        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s2));


    }

}
