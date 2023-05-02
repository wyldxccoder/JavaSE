package a07StreamDemo1;
//中间方法
import java.util.ArrayList;
import java.util.Collections;
//filter :过滤
// limit:获取前几个元素
// skip:跳过前几个元素
public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"张三","张无忌","张益达","李四","王五","张大炮");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
        list.stream().limit(3).forEach(s -> System.out.println(s));
        list.stream().skip(3).forEach(s -> System.out.println(s));
    }
}
