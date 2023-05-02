package a04MapDemo1;

import java.util.LinkedHashMap;
//存取有序 去重 (只对键)
public class LinkHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap <String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("a",154);
        lhm.put("c",154);
        lhm.put("c",154);
        lhm.put("b",154);
        System.out.println(lhm);
    }
}
