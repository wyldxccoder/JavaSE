package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入数据");
            String numstr = sc.nextLine();
            int num = Integer.parseInt(numstr);//将包装类转化为基本数据类型
            if (num < 1 || num > 100) {
                System.out.println("超过范围");
                break;
            } else {
                list.add(num);//自动装箱

            }
            int sum = getsum(list);
            if (sum > 200) {
                System.out.println("数据超过200");
                break;
            }


        }


    }

    private static int getsum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);//自动拆箱
            sum = num + sum;
        }
        return sum;
    }


}
