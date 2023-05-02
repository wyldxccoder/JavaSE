package a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建集合
        ArrayList <Student>list=new ArrayList<>();
        //创建学生对象
        Student s1=new Student("张三",18,"男");
        Student s2=new Student("李四",19,"女");
        Student s3=new Student("王五",25,"男");
        //将学生对象添加到数组中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //调用工具类中的方法
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);


    }
}
