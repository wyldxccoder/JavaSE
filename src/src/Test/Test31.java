package Test;

import java.util.Scanner;

public class Test31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int getsum = getsum(1);
        System.out.println(getsum);

    }
    public static int getsum(int day){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(day==n){
           return 1;
       }
        return (getsum(day+1)+1)*2;
    }


    }
