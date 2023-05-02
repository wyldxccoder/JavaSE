package myConvertCtream1;

import java.io.*;
//转化流 字节流想要用字符流中的方法
public class ConvertCtreamDemo2 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据,每次读一行,不会出现乱码
//        FileInputStream fis=new FileInputStream("result.txt");
//        InputStreamReader isr=new InputStreamReader(fis);
//        BufferedReader br=new BufferedReader(isr);
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("result.txt")));
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
    }
}
