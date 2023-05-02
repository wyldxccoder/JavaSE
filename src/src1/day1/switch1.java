package day1;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期鸡");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                case 3:
                System.out.println("慢走");
                    break;
            case 4:
                System.out.println("动力单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("跳一段鸡你太美");
                break;
            default:
                System.out.println("跳一段鸡你太美");
                break;
        }
    }
}
