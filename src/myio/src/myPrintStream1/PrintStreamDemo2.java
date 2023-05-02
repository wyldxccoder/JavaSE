package myPrintStream1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//字符打印流 (有缓冲区,需要开启自动刷新)
public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(new FileWriter("e.txt"),true);
        pw.println(999);
        pw.print(666);

        pw.close();
    }
}
