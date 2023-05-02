package a06immutableDemo1;

import java.util.List;
import java.util.Map;
import java.util.Set;

//不可变集合(不可添加修改)      map 键值对不能超过10个 若要超过10个用copyof方法
public class immitableDemo1 {
    public static void main(String[] args) {
        List<String> list = List.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        for (String s : list) {
            System.out.println(s);
        }
        /*list.add("aaa");
        list.remove("zhangsan");*/
        System.out.println("-------------------------");
        Set<String> set = Set.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        for (String s : set) {
            System.out.println(s);
        }
       /* set.add("aaa");
        set.remove("zhangsan");*/
        System.out.println("-------------------------");
        Map<String, String> map = Map.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        Set<String> keyS = map.keySet();
        for (String key : keyS) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        /*map.put("aaa","bbb");
        map.remove("zhangsan","lisi");*/
        System.out.println("---------------------");
        Map<String, String> map1 = Map.copyOf(map);

    }
}
