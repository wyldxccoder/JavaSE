package Test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] s1 = s.split(" ");
//      int n =Integer.parseInt(s1[0]) ;
//      int k =Integer.parseInt(s1[1]) ;
//        int sum=n;
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int sum=n;
        while (n>=k){
            sum=sum+n/k;
            n=n%k+n/k;

        }


        System.out.println(sum);


    }
}}
