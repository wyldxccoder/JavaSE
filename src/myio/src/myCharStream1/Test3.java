package myCharStream1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//修改文件的数据
public class Test3 {
    public static void main(String[] args) throws IOException {
        //读取数据
        FileInputStream fis=new FileInputStream("a.txt");
        //创建stringbuilder装字符串
        StringBuilder sb=new StringBuilder();
        int len;
        while ((len= fis.read())!=-1){
            sb.append((char)len);
        }
        fis.close();
        System.out.println(sb);
        //排序
        //将stringbuilder容器转化为字符串
        String str=sb.toString();
        //去掉字符串的- ,将字符串str转化为字符数组str1
        String str1[]=str.split("-");
        //创建集合将字符数组装入集合
        ArrayList<Integer>list=new ArrayList<>();
        //增强for遍历字符数组str1
        for (String s : str1) {
            //将包装类转化为基本数据类型
            int i = Integer.parseInt(s);
            //将数据添加到集合
            list.add(i);
        }
        //用父类collections的方法sort快速排序数据
        Collections.sort(list);
        System.out.println(list);
        //写出数据
        FileWriter fw=new FileWriter("a.txt");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //若集合数据为最后一个
            if(i==list.size()-1){
                //只写出数据不加-
                fw.write(list.get(i)+"");
            }else {
                //否则写出数据加上-
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
