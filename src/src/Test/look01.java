package Test;

import java.util.Arrays;
import java.util.Scanner;

public class look01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.substring(1, s.length() - 1).split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int count = arr.length-2;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] == arr[0] || arr[i] == arr[arr.length - 1]) {
                count--;
            }

        }
        System.out.println(count);

    }


}

