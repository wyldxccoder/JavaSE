package Test;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}
