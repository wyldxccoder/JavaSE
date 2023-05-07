package day4;

public class MethodDemo2 {
    public static void main(String[]arge){
//掌握带参数的方法的定义和调用
        getSum(5,6);
    }
    public static void getSum(int num1,int num2){
        int sum=0;
        sum=num1+num2;
        System.out.println(sum);
    }

}
