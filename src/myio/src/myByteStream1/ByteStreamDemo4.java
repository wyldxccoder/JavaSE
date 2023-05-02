package myByteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建对象,续写在后面加ture,默认是false
        FileOutputStream fos=new FileOutputStream("myio.txt",true);
        //写出数据  换行写
        String s1="woaidongxiaochang";
        byte[] bytes1 = s1.getBytes();
        fos.write(bytes1);
        String s2="\r\n";
        byte[] bytes2 = s2.getBytes();
        fos.write(bytes2);
        String s3="woaidongxiaochang";
        byte[] bytes3 = s3.getBytes();
        fos.write(bytes3);

        //释放资源
        fos.close();
    }
}
