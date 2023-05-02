package myByteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos=new FileOutputStream("a.txt");
        byte []bytes={97,98,99,100};
        //写出数据
        fos.write(bytes,1,3);
        //释放资源
        fos.close();
    }
}
