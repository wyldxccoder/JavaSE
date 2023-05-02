package Test;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i <= 100000 && i > 0) {
            if (i < 10) {
                System.out.println(1);
            }
            if (i < 100 && i >= 10) {
                System.out.println(2);
            }
            if (i < 1000 && i >= 100) {
                System.out.println(3);
            }
            if (i < 10000 && i >= 1000) {
                System.out.println(4);
            }
            if (i < 100000 && i >= 10000) {
                System.out.println(5);

            }
            }
        }
    }

