package Test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y){
            System.out.println(y+" "+x);
        }if(x<y){
            System.out.println(x+" "+y);
        }
    }
}

