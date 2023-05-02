package golearn;

import java.util.Scanner;

public class TEST1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票价格");
       double mony=sc.nextInt();
        System.out.println("请输入月份");
        int moth=sc.nextInt();
        System.out.println("请输入仓位 1头等舱2经济仓");
        int c=sc.nextInt();
        if(moth>=5&&moth<=10){
            if(c==1){
                mony= mony*0.9;
            }else { mony= mony*0.85;}
        }else if((moth>=11&&moth<=12)||(moth<=4&&moth>=1)){
            if(c==1){
                mony= mony*0.7;
            }else { mony= mony*0.65;}
        }
        System.out.println("你要支付的钱位"+mony);
    }
}
