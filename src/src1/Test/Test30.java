package Test;

import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x = sc.nextDouble();
        double sum=0;
        double m=1;
        double z=x;
        double f=1;

        for (int i = 1; i <= 10; i++) {
            sum=z/m*f+sum;
            z=z*x*x;
            m=m*(i*2)*(i*2+1);
            f=-f;
    }
        System.out.printf("%.3f",sum);

    }

}
