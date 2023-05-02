package a07StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();
        Collections.addAll(list1,"蔡徐坤,24","姚明明,23","理想想,22","吴京,24","蔡旭,30","杨光光,27");
        ArrayList<String>list2=new ArrayList<>();
        Collections.addAll(list2,"董丽颖,35","杨幂,36","高媛媛,43","张天天,31","刘诗,35","董甜甜,33");
        Stream<String> stream1 = list1.stream().filter(s -> s.split(",")[0].length()==3).limit(2);
        Stream<String> stream2 = list2.stream().filter(s -> s.startsWith("董")).skip(1);
        List<Actor> List = Stream.concat(stream1, stream2).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(List);

    }
}
