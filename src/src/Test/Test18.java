package Test;


import java.util.Arrays;
import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int []arr={x,y,z};
        Arrays.sort(arr);
        System.out.print(arr[2]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[0]);
    }
}
