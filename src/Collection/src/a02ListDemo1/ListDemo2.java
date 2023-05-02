package a02ListDemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合并添加元素
        List<String>list=new ArrayList<>();

        list.add("DDD");
        list.add("XXX");
        list.add("CCC");
        //迭代器遍历  遍历过程中可以删除元素
      /* Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/
        //增强for遍历
        /*for(String s:list){
            System.out.println(s);
        }*/
        //Lambda表达式遍历
        //forEach底层就是一个循环遍历,依次得到每一个元素
       /* list.forEach( s-> System.out.println(s));*/
        //普通for循环遍历
        /*for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }*/
        //列表迭代器遍历   遍历过程中可以添加元素
//        ListIterator<String> listit = list.listIterator();
//        while (listit.hasNext()){
//            String s = listit.next();
//            if ("CCC".equals(s)){
//                listit.add("LLL");
//                System.out.println(s);
//            }
//
//           ;}
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println(list);










    }
}
