package Test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        System.out.printf("%-9d %-9d %-9d",(int)Math.pow(i1, 1),(int)Math.pow(i1, 2),(int)Math.pow(i1, 3));
        System.out.println();
        System.out.printf("%-9d %-9d %-9d",(int)Math.pow(i2, 1),(int)Math.pow(i2, 2),(int)Math.pow(i2, 3));
        System.out.println();
        System.out.printf("%-9d %-9d %-9d",(int)Math.pow(i3, 1),(int)Math.pow(i3, 2),(int)Math.pow(i3, 3));

    }
}
