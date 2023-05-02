package a04MapDemo1;
/*双列集合*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//map集合第一种遍历方式:键找值
public class MapDemo1 {
    public static void main(String[] args) {
        //创建map集合对象
        Map<String,String>map=new HashMap<>();
        //添加元素
        map.put("张三","李四");
        map.put("王五","赵六");
        map.put("钱七","李八");
        /*获取键的单列集合*/
        Set<String> Key = map.keySet();
        /*迭代器遍历*/
 /*       Iterator<String> it = Key.iterator();
       while (it.hasNext()){
           String key = it.next();
           String value = map.get(key);
           System.out.println(key+" ="+value);*/
        //lamba表达式
        /*Key.forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                String value = map.get(key);
                System.out.println(key+" ="+value);
            }
        });*/
        //增强for
        for (String key : Key) {
            String value = map.get(key);
            System.out.println(key+" ="+value);
        }

       }
    }

