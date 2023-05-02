package a07StreamDemo1;
//终结方法
import java.util.*;
import java.util.stream.Collectors;
//collect :收集流中的数据,放到集合中
public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三-15-男","张无忌-16-男","张益达-17-男","李四-18-男","王五-19-男","张大炮-20-男","董畅畅-18-女");
        List<String> list1 = list.stream().filter(s -> "男".equals(s.split("-")[2])).collect(Collectors.toList());
        System.out.println(list1);
        Set<String> set = list.stream().filter(s -> "男".equals(s.split("-")[2])).collect(Collectors.toSet());
        System.out.println(set);
        Map<String, String> map = list.stream().filter(s -> "男".equals(s.split("-")[2])).collect(Collectors.toMap(s -> s.split("-")[0]+s.split("-")[1],
                s -> s.split("-")[2]));
        System.out.println(map);

    }
}
