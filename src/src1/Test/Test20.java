package Test;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        int a=(int)c;
        if(a>=97&&a<=122){
            a=a-96;
            System.out.println( a);
        }else
        if(a>=65&&a<=90){
            a=a-64;
            System.out.println(a);
        }
    }
}
