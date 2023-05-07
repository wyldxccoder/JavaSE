package golearn;

import java.util.Scanner;

public class learnif3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的支付额");
       int money= sc .nextInt();
        System.out.println("请输入你的会员等级");
        int vip= sc .nextInt();
        if(vip==1){
            System.out.println("你实际需要支付的钱位"+(money*0.9));}
         else if (vip==2) {
             System.out.println("你实际需要支付的钱位"+(money*0.8));}
        else if (vip==3){
            System.out.println("你实际需要支付的钱位"+(money*0.7));}
        else {  System.out.println("你实际需要支付的钱位"+money);}
    }
}
