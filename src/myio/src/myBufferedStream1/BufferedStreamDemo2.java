package myBufferedStream1;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("c.txt"));
        //拷贝,边读边写
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
