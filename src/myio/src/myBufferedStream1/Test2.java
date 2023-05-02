package myBufferedStream1;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //IO :随用随创建
        // 什么时候不用什么时候关
        BufferedReader br=new BufferedReader(new FileReader("count.txt"));
        String s = br.readLine();
        br.close();
        int count = Integer.parseInt(s);
        count++;
        if(count<=3){
            System.out.println("欢迎使用本软件,这是你第"+count+"免费使用本软件");
        }else {
            System.out.println("本软件只能免费使用3次,若想继续使用,请充值vip");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("count.txt"));
        bw.write(count+"");//97对应a,若想写出97 必须写 97+"",表示写的是字符
        bw.close();

    }
}
