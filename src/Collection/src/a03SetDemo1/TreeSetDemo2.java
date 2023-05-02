package a03SetDemo1;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //方法二:比较器排序
        //创建TreeSet对象的时候,传递比较器Comparator指定规则
        TreeSet<String>ts=new TreeSet<>(new Comparator<String>() {
            //长度排序,长度相同按照默认规则排序
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }
}
