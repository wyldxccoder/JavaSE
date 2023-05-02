package a08FunctionDemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//集合中存字符串类型数据,收集Student数据类型的数组当中
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");
        Student[] students = list.stream().map(s -> new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).toArray(Student[]::new);
//        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
