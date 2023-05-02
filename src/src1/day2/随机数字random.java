package day2;

import java.util.Random;
import java.util.Scanner;

//1-100猜一个数字
public class 随机数字random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要猜的数字");
        int number = sc.nextInt();
        Random r = new Random();
        int x = r.nextInt(100) + 1;//100表示0-99
        System.out.println("随机生成的数字为" + x);
        if (x == number) {
            System.out.println("恭喜你猜对了!");
        } else {
            System.out.println("抱歉你没有猜对");
        }

    }

}




