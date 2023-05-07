package com.itheimaDemo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int number= sc.nextInt();
        int ge=number/1%10;
        int shi=number/10%10;
        int bai=number/100%10;
        int qian=number/1000%10;
        System.out.println("个位数是:"+ge);
        System.out.println("十位数是:"+shi);
        System.out.println("百位数是:"+bai);
        System.out.println("千位数是:"+qian);
        }
}
