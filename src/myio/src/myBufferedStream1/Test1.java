package myBufferedStream1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//排序
public class Test1 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br=new BufferedReader(new FileReader("c.txt"));
        String line;
        ArrayList<String>list=new ArrayList<>();
        while ((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();
        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });
        //写出数据
        BufferedWriter bw=new BufferedWriter(new FileWriter("result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
