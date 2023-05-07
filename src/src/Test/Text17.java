package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Text17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int[] arr = {i1, i2, i3};
        Arrays.sort(arr);
        System.out.println(arr[2]);

    }
}
