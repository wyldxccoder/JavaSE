package Test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*int getsum = getsum(n);*/
        int []arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[arr.length-1]);

    }
   /* public static int getsum(int mon){
        if(mon==2||mon==1){
            return 1;
        }
        return getsum(mon-1)+getsum(mon-2);
    }*/

}
