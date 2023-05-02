package a04MapDemo1;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //方法一:默认的排序规则/自然排序
        //Javabean类实现Comparable接口,重写里面的抽象方法,在指定比较规则
        Student s1=new Student("zhangsan",23);
        Student s3=new Student("wangwu",24);
        Student s2=new Student("lisi",24);
        Student s4=new Student("zhaoliu",26);
        TreeMap<Student,String>tm=new TreeMap<>();
        tm.put(s1,"河南");
        tm.put(s2,"北京");
        tm.put(s3,"上海");
        tm.put(s4,"深圳");
        System.out.println(tm);
    }
}
