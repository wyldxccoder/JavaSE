package Test;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i<30){
            System.out.println(i*50);
        }if(i>=30){
            System.out.println(i*48);
        }
    }
}
