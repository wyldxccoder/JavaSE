package a07StreamDemo1;
//中间方法
import java.util.ArrayList;
import java.util.Collections;
//distinct:去重
// map:数据类型转化
public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三-15","张三-15","张无忌-16","张益达-17","李四-18","王五-19","张大炮-20");
        list.stream().distinct().forEach(s -> System.out.println(s));
    list.stream().map(s ->Integer.parseInt( s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
