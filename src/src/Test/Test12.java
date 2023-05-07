package Test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double capital = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            capital= capital*1.0225;
        }
        System.out.printf("%.6f",capital);

    }
}
