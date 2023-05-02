package myBufferedStream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new  FileReader("a.txt"));
        //readLine 方法在读取的时候,一次读一行,遇到回车换行结束,但不会读取回车换行
        String s1 = br.readLine();
        System.out.print(s1);
        String s2 = br.readLine();
        System.out.print(s2);
        br.close();
    }
}
