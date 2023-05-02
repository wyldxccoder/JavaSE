package a08FunctionDemo1;

import java.util.ArrayList;
import java.util.Collections;
//方法引用:引用静态方法:
// 格式:类名::静态方法
public class FunctionDemo1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
