package myCommons;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class IOUtilsDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream fos=new FileOutputStream("g.txt");
        //复制文件
       /* IOUtils.consume(fis);
        IOUtils.copyLarge();*/
        //读取写出数据
        IOUtils.readLines(fis);
        IOUtils.write("aaa",fos);

    }
}
