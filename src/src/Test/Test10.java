package Test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i1 = sc.nextDouble();
        double i2 = sc.nextDouble();
        double i3 = sc.nextDouble();
        double p=(i1+i2+i3)/2;
        double s1=p*(p-i1)*(p-i2)*(p-i3);
        double s2=Math.sqrt(s1);
        System.out.printf("%.2f",s2);
    }
}
