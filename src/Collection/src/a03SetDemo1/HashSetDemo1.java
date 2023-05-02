package a03SetDemo1;
//hashset 无序 不重复 无索引 :哈希值不重复
//hashset底层是哈希表
import java.util.HashSet;
/*哈希值:
1.如果没有重写hashcode方法,不同对象计算出的哈希值是不同的(哈希值不重复,对象可以重复)
2.如果已经重写hashcode方法,不同对象计算出的哈希值是相同的,计算出的哈希值就是一样的(哈希值重复,对象不可以重复)
3.但是在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希值也有可能是一样的(哈希碰撞)*/

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);
        HashSet<Student>hs=new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        //没有重写hashcode方法,不同对象计算出的哈希值是不同的
        //重写hashcode方法,不同对象只要属性值相同,计算出的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(hs);
        /*String 和 Integer Java已经重写了hashcode方法*/
        HashSet<String>hs1=new HashSet<>();
        hs1.add("zhangsan");
        hs1.add("lisi");
        hs1.add("lisi");
        System.out.println(hs1);

    }
}
