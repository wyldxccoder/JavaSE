package day2;

import java.util.Scanner;

//回文题
public class whiletest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int x = sc.nextInt();
        int temp = x;
        int sum = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            sum = sum * 10 + ge;

        }
        System.out.println(sum);
        System.out.println(sum == temp);
    }
}
