package a08FunctionDemo1;

import java.util.ArrayList;
import java.util.Arrays;
//引用数组的构造方法:格式:
//数据类型[]::new
public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}
