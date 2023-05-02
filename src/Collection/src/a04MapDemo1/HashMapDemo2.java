package a04MapDemo1;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
//用Random投票去每个地方的人数
        String []arr={"A","B","C","D"};
        //将去每个地方的人装入一个集合
        ArrayList<String>list=new ArrayList<>();
        Random r= new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
           list.add(arr[index]);
        }
        //创建HashMap对象
        HashMap<String,Integer>hm=new HashMap<>();
//        遍历集合
        for (String name : list) {
            //如果含有这个地方 这个地方人数加一
           if(hm.containsKey(name)){
              int count  = hm.get(name);
               count++;
               hm.put(name,count);
           }else {
               hm.put(name,1);
           }
        }
       int max=0;
       //获取最大人数 值
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int  value = entry.getValue();
            if(value>max){
                max=value;
            }
        }
        System.out.println(hm);
        System.out.println(max);
        //获取最大人数对应的地方 键
        for (Map.Entry<String, Integer> entry : entries) {
            int  value = entry.getValue();
            if(value==max){
                System.out.println(entry.getKey());
            }
        }


    }
}
