package a04MapDemo1;

import java.util.TreeMap;
//可排序(只对键)
// 底层是红黑树
public class TreeMapDemo1 {
    public static void main(String[] args) {
        //方法二:比较器排序
        //创建TreeSet对象的时候,传递比较器Comparator指定规则
        TreeMap<Integer,String>tm=new TreeMap<>(( o1,  o2)-> o2-o1);
        tm.put(5,"香蕉");
        tm.put(2,"西瓜");
        tm.put(3,"橘子");
        tm.put(4,"苹果");
        System.out.println(tm);


    }

}
