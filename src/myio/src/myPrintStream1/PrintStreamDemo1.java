package myPrintStream1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//字节打印流
public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream( new FileOutputStream("e.txt"));
        ps.println(99);
        ps.print(100) ;

        ps.close();
    }
}
