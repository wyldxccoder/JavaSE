package day10;

import java.util.Scanner;

public class scanner {
    //第一套体系
    //nextInt(); 接收整数
    //nextdoublt(); 接收小数
    //next();  接收字符串
    //遇到空格,字表符,回车就停止接收
    //第二套体系
    //nextline();
    //遇到回车才停止接收
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数");
       int number1= sc.nextInt();
        System.out.println(number1);  //输入111 空格 222
        int number2=sc.nextInt();
        System.out.println("输入第二个整数");
        System.out.println(number2);*/
        /*Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String a= sc.next();
        System.out.println(a);  //输入aaa 空格 bbb
      String b=sc.next();
        System.out.println("输入第二个字符串");
        System.out.println(b);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String a= sc.nextLine();
        System.out.println(a);  //输入aaa 空格 bbb
        String b=sc.nextLine();
        System.out.println("输入第二个字符串");
        System.out.println(b);
    }
}
