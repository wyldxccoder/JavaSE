package TestDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
//概率随机
public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<String> city1=new ArrayList<>();
        ArrayList<String> city2=new ArrayList<>();
        Collections.addAll(city1,"无锡","徐州","常州","南通","连云港","宿迁","淮安");
        Collections.addAll(city2,"郑州","开封","洛阳");
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        //打乱集合
        Collections.shuffle(list);
        //随机获取索引
        Random r=new Random();
        int index = r.nextInt(list.size());
        Integer num = list.get(index);
        if(num==1){
            int i1 = r.nextInt(city1.size());
            String s1 = city1.get(i1);
            System.out.println(s1);

        }else {
            int i2 = r.nextInt(city2.size());
            String s2 = city2.get(i2);
            System.out.println(s2);

        }



    }
}
