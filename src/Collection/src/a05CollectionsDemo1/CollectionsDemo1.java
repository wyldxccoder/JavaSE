package a05CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> lise = new ArrayList<>();
        System.out.println("-------------添加全部数据-----------");
        //添加全部数据
        Collections.addAll(lise, "A", "B", "C", "D");
        System.out.println(lise);
        System.out.println("-------------打乱数据-----------");
        //打乱数据
        Collections.shuffle(lise);
        System.out.println(lise);
        System.out.println("----------快速排序--------------");
        //快速排序
        Collections.sort(lise);
        System.out.println(lise);
        System.out.println("------------自定义快速排序------------");
        //自定义快速排序
        Collections.sort(lise, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
              return o1.compareTo(o2);
            }
        });
        System.out.println(lise);
        System.out.println("----------二分法 查找元素--------------");
        //二分法 查找元素
        Collections.binarySearch(lise,"B");
        System.out.println(lise);
        System.out.println("-----------获取自然排序的最大最小值-------------");
        //获取自然排序的最大最小值
        String max = Collections.max(lise);
        System.out.println(max);
        String min = Collections.min(lise);
        System.out.println(min);
        System.out.println("-----------交互位置-------------");
        //交互位置
        Collections.swap(lise,0,3);
        System.out.println(lise);
        System.out.println("-----------填充-------------");
        //填充
        Collections.fill(lise,"a");
        System.out.println(lise);

    }
}
