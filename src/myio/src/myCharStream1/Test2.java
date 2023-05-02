package myCharStream1;
//文件加密

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//^:异或
//一个数字异或两次仍是这个数字

public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println(111^10);//101
        System.out.println(101^10);//111
        FileInputStream fis=new FileInputStream("a.png");
        FileOutputStream fos=new FileOutputStream("c.png");

        int len;
        while ((len=fis.read())!=-1){
            //加密
            fos.write(len^2);
        }
        fos.close();
        fis.close();
    }
}
