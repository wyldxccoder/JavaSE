package day2;

import java.util.Scanner;

//判断是否为一个质数(只能被1和自身整除)
public class fortest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag = false) {
            System.out.println(number + "不是质数");
        } else {
            System.out.println(number + "是质数");
        }


    }
}
