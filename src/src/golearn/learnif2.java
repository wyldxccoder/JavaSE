package golearn;

import java.util.Scanner;

public class learnif2 {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的分数");
        int cord = sc.nextInt();
        if(cord>=0&&cord<=100) {
            if (95 <= cord && cord <= 100) {
                System.out.println("奖励自行车一辆");
            } else if (cord < 95 && cord >= 90) {
                System.out.println("奖励游乐场玩一天");
            } else if (cord < 90 && cord > 80) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");


            }
        }else {
            System.out.println("非法数据");

        }
    }
}