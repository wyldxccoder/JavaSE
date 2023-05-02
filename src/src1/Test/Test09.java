package Test;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double d1=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        double d2=Math.sqrt(d1);
        System.out.printf("%.2f",d2);

    }
}
