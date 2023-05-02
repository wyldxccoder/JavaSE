package myHutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;

public class FileUtilDemo {
    public static void main(String[] args) {
        //根据参数创建一个file对象(好用)
        File file = FileUtil.file("C:\\", "aaa", "ccc", "ddd.txt");
        System.out.println(file);
        //根据参数创建文件(可以创建父级路径)
        FileUtil.touch(file);
        ArrayList<String>list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //把集合中的数据写出到文件中 覆盖模式
       /* FileUtil.writeLines(list,file,"UTF-8",true);*/
        //把集合中的数据写出到文件中 续写模式
        FileUtil.appendLines(list,file,"UTF-8");
        //把文件写到集合中
        ArrayList<String> list1 = FileUtil.readLines(file, "UTF-8", new ArrayList<>());
        System.out.println(list1);
        //拷贝文件或者文件夹
        File file1=new File("C:\\aaa");
        File dest1=new File("C:\\bbb");
        FileUtil.copy(file1,dest1,true);


    }
}
