package a07StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"张三","张无忌","张益达","李四","王五");
        list.stream().filter(name-> name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
    }
}
