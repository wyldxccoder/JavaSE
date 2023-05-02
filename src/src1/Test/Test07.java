package Test;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        final double PI=3.14159;
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double biaomian=PI*r*r*2+2*PI*r*h;
        System.out.printf("%.2f",biaomian);
    }
}

