package Test;

import java.util.*;

public class Test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] str1 = s1.split(":");
        int i1 = Integer.parseInt(str1[0]);
        int i2 = Integer.parseInt(str1[1]);
        int i3 = Integer.parseInt(str1[2]);
        String s2 = sc.nextLine();
        String[] str2 = s2.split(":");
        int i4 = Integer.parseInt(str2[0]);
        int i5 = Integer.parseInt(str2[1]);
        int i6 = Integer.parseInt(str2[2]);
        System.out.println((i4*3600+i5*60+i6)-(i1*3600+i2*60+i3));
       
    }
}
