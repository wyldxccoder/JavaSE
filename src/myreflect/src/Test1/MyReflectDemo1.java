package Test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo1 {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student s=new Student("董畅畅",18,"女",165,"生气");
        Teacher t=new Teacher("王云龙",20000);
        saveObject(s);
    }

    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //创建io流
        BufferedWriter bw=new BufferedWriter(new FileWriter("myreflect\\a.txt"));
        //获取class对象
        Class clazz = obj.getClass();
        //获取成员变量对象
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //打开临时权限
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object o = field.get(obj);
            //写出数据
            bw.write(name+"="+o);
            bw.newLine();
        }
        //关闭资源
        bw.close();
    }
}
