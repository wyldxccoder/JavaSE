package TestDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class TestDemo2 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"无锡市","徐州市","常州市","南通市","连云港市");        list.add("南京市");

        Collections.shuffle(list);
        System.out.println(list);
    }
}
