package myObjectStream1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws IOException {
        ArrayList<People> list=new ArrayList<>();
        People p1=new People("zhangsan",20,"男");
        People p2=new People("lisi",21,"男");
        People p3=new People("wangwu",22,"男");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("f.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
