package Test;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        double b=1500;
        if(i<=10000){
            b= b+(i*0.05);
        }else if(i>10000&&i<=50000){
            b= (i-10000)*0.03+2000;
        }else if(i>50000){
            b=  (i-50000)*0.02+3200;
        }
        System.out.printf("%.2f",b);
    }
}
