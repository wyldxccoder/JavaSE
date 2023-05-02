package myCharStream1;
//文件解密
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test21 {
    public static void main(String[] args) throws IOException {
        System.out.println(111^10);//101
        System.out.println(101^10);//111
        FileInputStream fis=new FileInputStream("c.png");
        FileOutputStream fos=new FileOutputStream("d.png");

        int len;
        while ((len=fis.read())!=-1){
            //解密
            fos.write(len^2);
        }
        fos.close();
        fis.close();
    }
}
