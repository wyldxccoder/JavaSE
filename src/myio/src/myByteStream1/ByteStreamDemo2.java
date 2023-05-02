package myByteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos=new FileOutputStream("a.txt");
        //写出数据
        byte [] bytes={97,98,99,100};
        fos.write(bytes);
        //释放资源
        fos.close();
    }
}
