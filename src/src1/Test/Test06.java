package Test;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        final double PI=3.14159;
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble();
        double zhou=2*PI*r;
        double mian=PI*r*r;
        System.out.printf("%.2f",zhou);
        System.out.print(" ");
        System.out.printf("%.2f",mian);

    }
}
