package com.itheimaDemo;

import java.util.Scanner;

public class shuishouyishi {
    public static void main(String[] args) {
        System.out.println("please input a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 10;
        b += a;
        System.out.println("结果为" + b);


    }
}
