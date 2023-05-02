package myZipStream1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
//解压缩流
public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建一个File表示要解压的压缩包
        File scr=new File("C:\\aaa.zip");
        //创建一个File表示要解压的目的地
        File dest=new File("C:\\");
        getUnzip(scr, dest);
    }
    //定义一个方法用来解压
    public static void getUnzip(File scr, File dest) throws IOException {
        //解压的本质:把压缩包里面的每一个文件或者文件夹读取出来,按照层级拷贝到目的地中
        //创建一个解压流用来读取压缩包的数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(scr));
        //要先获取到压缩包里面的每一个ZipEntry对象
        //表示当前在压缩包中获取到的文件或者文件夹
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            System.out.println(entry);
            if(entry.isDirectory()){
                //文件夹:需要在目的地dest处创建一个相同的文件夹
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //文件:需要读取到压缩包中的文件,并把他存放到目的地dest文件夹中(按照层级目录进行存放)
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b=zip.read())!=-1){
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
