package Test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cha = sc.next();
        char c = cha.charAt(0);
        int a=(int) c;
        if(a>=97&&a<=122){
            a=a-32;
            System.out.println((char) a);
        }else
        if(a>=65&&a<=90){
            System.out.println((char) a);
        }
    }
}
