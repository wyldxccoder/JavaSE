package Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = isprime(n);
        if(n==1){
            System.out.println("No");
        }
        if(isprime){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

        public static boolean isprime ( int n){
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

}






