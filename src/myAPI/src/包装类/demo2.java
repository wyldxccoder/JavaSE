package 包装类;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        //以后用到键盘录入只用nextLine
        //特点遇到回车才停止,遇到空格,制表符不停止
        System.out.println("请输入");
        Scanner sc=new Scanner(System.in);
        String line = sc.nextLine();
        //需要什么基本数据类型就转换为什么  parseint...
        //int i = Integer.parseInt(line);
        double v = Double.parseDouble(line);
        //System.out.println(i);
        System.out.println(v+1);

    }
}
