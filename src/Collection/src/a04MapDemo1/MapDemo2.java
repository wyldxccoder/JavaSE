package a04MapDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

//map集合第二种遍历方式:键值对遍历
public class MapDemo2 {
    public static void main(String[] args) {
        //创建map集合对象
        Map<String,String>map=new HashMap<>();
        //添加元素
        map.put("张三","李四");
        map.put("王五","赵六");
        map.put("钱七","李八");
        //通过键值对对象进行遍历
      Set<Map.Entry<String, String>> entrys = map.entrySet();
     /*  增强for
     for (Map.Entry<String, String> entry : entrys) {
           String key = entry.getKey();
          String value = entry.getValue();
          System.out.println(key+"="+value);
       }*/
    /*    迭代器遍历
        Iterator<Map.Entry<String, String>> it = entrys.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }*/
        entrys.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> Entry) {
                String key = Entry.getKey();
                String value= Entry.getValue();
                System.out.println(key+"="+value);
            }
        });

    }
}
