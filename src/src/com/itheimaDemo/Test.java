package com.itheimaDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个整数");
       int number1= sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2=sc.nextInt();
        boolean result=number1==6||number2==6||(number1+number2)%6==0;
        System.out.println(result);
    }
}
