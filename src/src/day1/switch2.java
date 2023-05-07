package day1;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票修改");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
