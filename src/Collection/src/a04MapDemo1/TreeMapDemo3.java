package a04MapDemo1;

import java.util.TreeMap;
import java.util.function.BiConsumer;
//求每个字符出现的次数
public class TreeMapDemo3 {
    public static void main(String[] args) {
        String s="aababcabcdabcde";
        TreeMap<Character,Integer>tm=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tm.containsKey(c)){
                //字符出现的次数
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                tm.put(c,1);
            }
        }
        //拼接字符串
        StringBuilder sb=new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);
    }
}
