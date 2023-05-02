package Test05;

import java.util.ArrayList;
import java.util.Collections;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        Mythread t1=new Mythread(list);
        Mythread t2=new Mythread(list);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();

    }
}
