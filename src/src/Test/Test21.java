package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.next();
        char c1 = s1.charAt(0);
        String s2 = sc.next();
        char c2 = s2.charAt(0);
        String s3 = sc.next();
        char c3 = s3.charAt(0);
        int a1=(int)c1;
        int a2=(int)c2;
        int a3=(int)c3;
        int []arr={c1,c2,c3};
        Arrays.sort(arr);
        System.out.println((char) arr[2]);
    }
}
