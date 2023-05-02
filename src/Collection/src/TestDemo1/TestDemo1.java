package TestDemo1;

import java.util.*;

//集合嵌套
public class TestDemo1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city1,"郑州市","开封市","洛阳市");
        Collections.addAll(city2,"南京市","无锡市","徐州市");
        hm.put("河南省", city1);
        hm.put("江苏省", city2);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();

          StringJoiner sj=new StringJoiner(",","","");
            for (String city: value) {
                sj.add(city);
            }
            System.out.println(key+"="+sj);
        }


    }

}

