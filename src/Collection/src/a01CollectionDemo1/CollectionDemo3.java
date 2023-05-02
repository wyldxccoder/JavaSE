package a01CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;
//增强for遍历
//格式:for(数据类型 变量名: 集合/数组){}
//快捷键:集合名.for
public class CollectionDemo3 {
    public static void main(String[] args) {
        //利用多态,创建集合对象
        Collection<String> coll=new ArrayList<>();
        //添加元素到集合中
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
