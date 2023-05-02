package Test05;

import java.util.ArrayList;
import java.util.Collections;

public class Mythread extends Thread{
    ArrayList<Integer> list;

    public Mythread(ArrayList<Integer> list) {
        this.list = list;
    }
static ArrayList<Integer>list1=new ArrayList<>();
static ArrayList<Integer>list2=new ArrayList<>();
    @Override
    public void run() {

ArrayList<Integer>boxlist=new ArrayList<>();
        while (true){
            synchronized (Mythread.class){
               if(list.size()==0){
                       Integer max = Collections.max(boxlist);
                       int sum=0;
                       for (Integer integer : boxlist) {
                           sum=integer+sum;
                       }
                       System.out.println(getName()+"最大值为"+max+"总和为"+sum+boxlist);
                   break;
               }else {
                   Collections.shuffle(list);
                   Integer prize = list.remove(0);
                   boxlist.add(prize);
               }

            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
