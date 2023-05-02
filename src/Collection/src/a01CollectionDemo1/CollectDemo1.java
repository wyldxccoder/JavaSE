package a01CollectionDemo1;
//Collect没有索引

import java.util.ArrayList;
import java.util.Collection;

public class CollectDemo1 {
    public static void main(String[] args) {
        //利用多态,创建集合对象
        Collection <String> coll=new ArrayList<>();
        //添加元素到集合中
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);
        //清空集合中元素
        /*coll.clear();
        System.out.println(coll);*/
        //删除集合中元素  只能按照元素对象删除,不能按照排序删除
        coll.remove("aaa");
        System.out.println(coll);
        //判断集合中对象是否存在
        coll.contains("bbb");
        System.out.println(coll);
        //判断集合是否为空
        System.out.println(coll.isEmpty());
        //求集合的长度
        System.out.println(coll.size());


    }
}
