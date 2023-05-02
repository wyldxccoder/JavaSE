package day2;

import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要猜的数字");
     int i1= sc.nextInt();
        int i2 = r.nextInt(6) + 1;
        System.out.println("你筛到的数字为"+i2);
        if(i1==i2){
            System.out.println("恭喜你猜对了");
        }else {
            System.out.println("很抱歉你猜错了");
        }

    }
}
