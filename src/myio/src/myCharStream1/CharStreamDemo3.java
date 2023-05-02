package myCharStream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        //续写开关默认关闭,true打开
        FileWriter fw=new FileWriter("myio.txt",true);
        //写出数据
//        fw.write(98);
//        fw.write("及你太美");
//        fw.write("及你太美",0,3);
        char[] chars={'a','b','c','我'};
//        fw.write(chars);
        fw.write(chars,0,2);
        //释放资源
        fw.close();
    }
}
