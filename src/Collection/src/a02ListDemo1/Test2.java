package a02ListDemo1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ListUtil.addAll(list,111,222,333);
        System.out.println(list);
    }
}
