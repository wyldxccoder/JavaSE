package a03SetDemo1;
//LinkedHashSet 有序 不重复 无索引 :哈希值不重复
//LinkedHashSet底层是哈希表
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);
        Student s3=new Student("lisi",24);
        Student s4=new Student("wangwu",25);
        LinkedHashSet lhs=new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        System.out.println(lhs);

    }
}
