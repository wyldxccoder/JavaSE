package studentsystem;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入顾客一的编号:");
        int i1 = sc.nextInt();
        System.out.println("请输入顾客一的姓名:");
        String s1 = sc.next();
        System.out.println("请输入顾客一的年龄:");
        int i2 = sc.nextInt();
        System.out.println("请输入顾客一的积分:");
        int i3 = sc.nextInt();
        System.out.println("请输入顾客二的编号:");
        int i4 = sc.nextInt();
        System.out.println("请输入顾客二的姓名:");
        String s2 = sc.next();
        System.out.println("请输入顾客二的年龄:");
        int i5 = sc.nextInt();
        System.out.println("请输入顾客二的积分:");
        int i6 = sc.nextInt();
        System.out.println("第一位顾客的编号是:"+i1+" ,"+"姓名是:"+s1+" ,"+"年龄是:"+i2+" ,"+"积分是:"+i3);
        System.out.println("第二位顾客的编号是:"+i4+" ,"+"姓名是:"+s2+" ,"+"年龄是:"+i5+" ,"+"积分是:"+i6);
    }
}
