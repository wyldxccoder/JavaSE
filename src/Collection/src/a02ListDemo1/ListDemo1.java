package a02ListDemo1;
//list  有序,可重复, 有索引
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo1 {
    public static void main(String[] args) {
        //创建一个集合对象并添加元素
        List <String>list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();
        List<String>list2=new Vector<>();
        Vector<String>vector=new Vector<>();
        List<String>list3=new LinkedList<>();
        LinkedList<String>strings=new LinkedList<>();

        list.add("ddd");
        list.add("xxx");
        list.add("ccc");
        //在指定位置添加元素
        list.add(0,"ll");
        //删除指定位置元素,返回被删除的元素
        list.remove(0);
        //修改指定位置的元素,返回被修改的元素
        list.set(0,"DDD");
        //返回指定索引的元素



        System.out.println(list);
    }
}
