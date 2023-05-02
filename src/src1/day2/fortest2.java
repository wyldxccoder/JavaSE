package day2;

import java.util.Scanner;
//求一个整数的平方根的整数部分
public class fortest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个大于2的整数");
      int x=  sc.nextInt();
        for (int i = 1; i <=x; i++) {
       int temp=i*i;
            if(temp==x){
                System.out.println("这个整数的平方根的整数部分为"+i);
                break;

            }
            else if(temp>x){
                System.out.println("这个整数的平方根的整数部分为"+(i-1));
                break;
            }
        }

    }
}
