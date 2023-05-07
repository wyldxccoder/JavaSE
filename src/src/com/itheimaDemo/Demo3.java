package com.itheimaDemo;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度");
        int number1 = sc.nextInt();
        System.out.println("请输入你对象的时髦度");
        int nbmber2 = sc.nextInt();
        System.out.println(number1 > nbmber2);
    }
}
