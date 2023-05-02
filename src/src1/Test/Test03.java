package Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag=true;
        for (int i = 2; i < n/2; i++) {
            if(n==1) {
                flag = false;
                break;
            }
            if(i/n==0){
                flag=false;
                break;
            }

        }

         if(flag){
            System.out.println("Yes");

        }   else {
            System.out.println("No");
        }
    }
}