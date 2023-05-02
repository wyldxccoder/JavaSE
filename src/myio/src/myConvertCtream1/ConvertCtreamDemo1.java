package myConvertCtream1;

import java.io.*;
import java.nio.charset.Charset;

//转化流 指定字符集写数据
//将GBK文件转化为UTF-8文件
public class ConvertCtreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建转化流
        //jdk11前的方法(淘汰)
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("C:\\aaa\\scr\\a.txt"),"GBK");
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("e.txt"),"UTF-8");
        //拷贝
//        int len;
//        while ((len=isr.read())!=-1){
//            osw.write(len);
//        }
//        //释放资源
//        osw.close();
//        isr.close();
        //现在的方法
        FileReader fr = new FileReader("C:\\\\aaa\\\\scr\\\\a.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("e.txt", Charset.forName("UTF-8"));
        //拷贝
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(len);

        }
        fw.close();
        fr.close();
    }
}
