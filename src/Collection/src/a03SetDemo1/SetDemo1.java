package a03SetDemo1;
//set 无序 不重复 无索引
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        //元素添加两次会添加失败
        boolean i1 = set.add("zhangsan");
        boolean i2 = set.add("zhangsan");
        boolean i3= set.add("lisi");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        //打印无序
       /* System.out.println(set);*/
        //迭代器遍历集合
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        //增强for遍历集合
        for (String s : set) {
            System.out.println(s);
        }
        //lambda表达式遍历集合  ***三种集合都不需要索引
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
