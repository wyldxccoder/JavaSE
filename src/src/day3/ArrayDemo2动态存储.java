package day3;

import java.util.Random;

public class ArrayDemo2动态存储 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }
        System.out.println(sum);
        double avge = sum / arr.length;
        System.out.println(avge);
    }
}
