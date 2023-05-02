package myBufferedStream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("c.txt"));
        bw.write("abc");
        //newLine方法 换行
        bw.newLine();
        bw.write("def");
        bw.newLine();
        bw.close();
    }
}
