package day1;

import java.util.Scanner;

public class inputword {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字");
        String str = sc.next();
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("你输入的文字为" + arr[i]);

        }


    }
}
