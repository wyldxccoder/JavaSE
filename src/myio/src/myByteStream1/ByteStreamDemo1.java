package myByteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos=new FileOutputStream("myio.txt");
        //写出数据
        fos.write(99);
        //释放资源
        fos.close();

    }
}
