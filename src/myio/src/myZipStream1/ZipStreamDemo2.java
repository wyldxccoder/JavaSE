package myZipStream1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//压缩流
public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建file对象表示要压缩的文件
        File scr=new File("C:\\bbb\\a.txt");
        //创建file对象表示压缩包的位置
        File dest=new File("C:\\");
        //调用方法来压缩
        tozip(scr,dest);
    }

    public static void tozip(File scr, File dest) throws IOException {
        //创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //创建ZipEntry对象,表示压缩包里面的每一个文件和文件夹
        ZipEntry entry=new ZipEntry("a.txt");
        //把ZipEntry对象放到压缩包中
        zos.putNextEntry(entry);
        //把scr文件中的数据写到压缩包中
        FileInputStream fis=new FileInputStream(scr);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }
        zos.close();

    }
}
