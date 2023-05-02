package a04MapDemo1;

import java.util.HashMap;
import java.util.function.BiConsumer;
//hash去重 (只对键)
// 底层是哈希表
public class HashMapDemo1 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        Student s4=new Student("zhangsan",23);
        HashMap<Student,String>hm=new HashMap<>();
        hm.put(s1,"河南");
        hm.put(s2,"青海");
        hm.put(s3,"上海");
        hm.put(s4,"深圳");
        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student);
            }
        });
    }
}
