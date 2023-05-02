package Test;

import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int sum=1;
        for (int i = x; i > 0; i--) {
          sum= i*sum;
        }
        System.out.println(sum);

    }
}
