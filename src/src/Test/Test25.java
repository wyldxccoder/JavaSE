package Test;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int abs1 = Math.abs(i1);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int getmax = getmax(abs1, abs2, abs3);
        int x;
        x=i1;
        getmax=abs1;
        if(abs2>getmax){
            getmax=abs2;
            x=i2;
        }if(abs3>getmax){
            getmax=abs3;
            x=i3;
        }
        System.out.println(x);


            }





    public static int getmax(int a,int b,int c){
        int max1 = Math.max(a, b);
        int max = Math.max(max1, c);
        return max;
    }
}
