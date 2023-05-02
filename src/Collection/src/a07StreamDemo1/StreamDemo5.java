package a07StreamDemo1;
//终结方法
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//forEach :遍历
// count :计数
// toArray :收集流中的数据,放到数组中
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三-15","张三-15","张无忌-16","张益达-17","李四-18","王五-19","张大炮-20");
        list.stream().forEach(s -> System.out.println(s));
        long count = list.stream().count();
        System.out.println(count);
        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
