package myByteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis=new FileInputStream("C:\\Users\\30804\\OneDrive\\图片\\屏幕快照\\7.png");
        FileOutputStream fos=new FileOutputStream("b.png");
        //拷贝(边读边写)
        int len;
        byte []bytes=new byte[1024*1024*5];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //释放资源(先开后关)
        fos.close();
        fis.close();
    }
}
