package a01CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//迭代器遍历
public class CollectionDemo2 {
    public static void main(String[] args) {
        //利用多态,创建集合对象
        Collection <String>coll=new ArrayList<>();
        //添加元素到集合中
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        //获取迭代器对象
        //迭代器好比一个箭头,默认指向集合0索引
        Iterator <String>it=coll.iterator();
        //利用循环判断不断获取每一个元素  hasNext判断元素是否存在
        while (it.hasNext()){
            //next作用:获取元素,并移动指针
            String str = it.next();
            System.out.println(str);
        }

    }
}
