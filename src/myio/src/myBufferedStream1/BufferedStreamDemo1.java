package myBufferedStream1;
//缓冲流
import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("c.txt"));
        //拷贝,边读边写
        int len;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
