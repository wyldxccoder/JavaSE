package Test;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double i = sc.nextDouble();
        double abs = Math.abs(i);
        System.out.printf("%.2f",abs);
    }
}
