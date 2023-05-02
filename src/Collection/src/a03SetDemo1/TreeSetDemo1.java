package a03SetDemo1;
//TreeSet 可排序 不重复 无索引
//TreeSet 底层是红黑树
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //对象排序
        //方法一:默认的排序规则/自然排序
        //Javabean类实现Comparable接口,重写里面的抽象方法,在指定比较规则
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        TreeSet<Student>ts1=new TreeSet<>();
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        System.out.println(ts1);
        //TreeSet对Integer Double类型默认按照从小到大顺序排序
        //遍历用 迭代器 增强for lambda表达式 因为无索引
        TreeSet<Integer>ts2=new TreeSet<>();
        ts2.add(1);
        ts2.add(3);
        ts2.add(2);
        ts2.add(1);
        System.out.println(ts2);
        //TreeSet对字符 字符串类型按照ascll码表从小到大排序
        TreeSet<String>ts3=new TreeSet<>();
        ts3.add("a");
        ts3.add("f");
        ts3.add("c");
        ts3.add("v");
        ts3.add("b");
        System.out.println(ts3);


    }
}
