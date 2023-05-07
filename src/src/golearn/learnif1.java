package golearn;

import java.util.Scanner;

public class learnif1 {

        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入男朋友酒量");
            int wein=sc.nextInt();
            if (wein>10){
                System.out.println("小伙子可以啊");}
            else {
                System.out.println("离我女儿远点");
            }
    }
}
