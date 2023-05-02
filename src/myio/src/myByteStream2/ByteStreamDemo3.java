package myByteStream2;
//拷贝
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis=new FileInputStream("C:\\Users\\30804\\OneDrive\\图片\\本机照片\\1.png");
        FileOutputStream fos=new FileOutputStream("a.png");
        //拷贝(边读边写)
        int b ;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }

        //释放资源(先开后关)
        fos.close();
        fis.close();

    }
}
