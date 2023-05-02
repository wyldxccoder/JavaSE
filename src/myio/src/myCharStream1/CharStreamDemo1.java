package myCharStream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileReader fr=new FileReader("myio.txt");
        //读取数据
        //read细节:
        //1.read():默认也是一个字节一个字节的读取的,如果遇到中文就会一次读取多个
        //2.在读取之后,方法的底层还会进行解码并转化为十进制
        int ch;
        while ((ch= fr.read())!=-1){
            System.out.print((char) ch);
        }
        //释放资源
        fr.close();
    }
}
