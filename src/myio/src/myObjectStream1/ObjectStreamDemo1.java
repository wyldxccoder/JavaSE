package myObjectStream1;

import java.io.*;
//把Java中的对象写到本地文件中
//需要让javabean类实现Serializable接口
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Student s = new Student("zhangsan", 20,"河南");
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
        //写出数据
        oos.writeObject(s);
        //释放资源
        oos.close();
    }
}
