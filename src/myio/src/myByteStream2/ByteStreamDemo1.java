package myByteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis=new FileInputStream("a.txt");
        //读取数据
        int read = fis.read();
        System.out.println((char)read);


        //释放资源
        fis.close();

    }
}
