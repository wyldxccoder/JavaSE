package a04MapDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//map集合第san种遍历方式:lambad表达式遍历
public class MapDemo3 {
    public static void main(String[] args) {
        //创建map集合对象
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("张三", "李四");
        map.put("王五", "赵六");
        map.put("钱七", "李八");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });

    }
}
