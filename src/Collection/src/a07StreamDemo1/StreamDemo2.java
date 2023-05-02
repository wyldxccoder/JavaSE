package a07StreamDemo1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

//单列集合获取stream流 Collections中默认的方法
// 双列集合获取stream流 获取keySet或者entrySet单列集合在获取stream流
// 数组获取stream流 Arrays工具类中静态方法
// 一堆零散数据 stream接口中静态方法
public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("-----------1-------------");
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        hm.keySet().stream().forEach(s -> System.out.println(s));
        hm.entrySet().stream().forEach(s-> System.out.println(s));
        System.out.println("-----------2-------------");
        String []arr1={"a","b","c","d"};
        int []arr2={1,2,3,4};
        Arrays.stream(arr1).forEach(s -> System.out.println(s));
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
        System.out.println("-----------3-------------");
        Stream.of(1,2,3,4).forEach(s-> System.out.println(s));

        Stream.of(arr2).forEach(s -> System.out.println(s));
        System.out.println("-----------4-------------");


    }
}
