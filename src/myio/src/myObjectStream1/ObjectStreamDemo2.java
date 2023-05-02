package myObjectStream1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//把本地文件中的对象读到Java中
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //创建反序列化流对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f.txt"));
        //读取数据
        Object o = ois.readObject();
        System.out.println(o);
        //释放资源

        ois.close();
    }
}
