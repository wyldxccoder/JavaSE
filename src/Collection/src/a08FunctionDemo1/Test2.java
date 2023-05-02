package a08FunctionDemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//创建集合添加学生对象,只获取名字放到数组中;
public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        ArrayList<Student> list=new ArrayList<>();
        Collections.addAll(list,s1,s2,s3);
        String[] array1 = list.stream().map(Student::getName).toArray(String[]::new);
        Integer[] array2 = list.stream().map(Student::getAge).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
