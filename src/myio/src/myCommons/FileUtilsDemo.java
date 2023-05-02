package myCommons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsDemo {
    public static void main(String[] args) throws IOException {
        //复制文件
        /*File file=new File("a.txt");
        File dest=new File("g.txt");
        FileUtils.copyFile(file,dest);*/
        //复制文件夹
        /*File file=new File("C:\\aaa");
        File dest=new File("C:\\bbb");
        FileUtils.copyDirectory(file,dest);*/
        //复制文件夹
        /*File file=new File("C:\\aaa");
        File dest=new File("C:\\bbb");
        FileUtils.copyDirectoryToDirectory(file,dest);*/
        //删除文件
        /*File file=new File("g.txt");
        FileUtils.delete(file);*/
        //删除文件夹
        /*File dest=new File("C:\\bbb");
        FileUtils.deleteDirectory(dest);*/
        //清空文件夹
       /* File dest=new File("C:\\bbb");
        FileUtils.cleanDirectory(dest);*/
        //读取数据中的数据变成字符串
        File dest=new File("g.txt");
        FileUtils.readFileToString(dest);
        //写出数据
        FileUtils.write(dest,"djwiduj");

    }
}
