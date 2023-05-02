package a06bigintegerdemo1;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //创建BigInteger对象
        //BigInteger bd1=new BigInteger("100000");//指定大整数,都可以
        BigInteger bd1= BigInteger.valueOf(17);//long范围整数,超过会报错
        BigInteger bd2= BigInteger.valueOf(10);

        BigInteger add = bd1.add(bd2);//加
        System.out.println(add);

        BigInteger subtract = bd1.subtract(bd2);//减
        System.out.println(subtract);

        BigInteger multiply = bd1.multiply(bd2);//乘
        System.out.println(multiply);

        BigInteger divide = bd1.divide(bd2);//除取余
        System.out.println(subtract);

        BigInteger[] arr = bd1.divideAndRemainder(bd2);//除取商和余
        System.out.println(arr[0]);//商
        System.out.println(arr[1]);//余

        boolean result = bd1.equals(bd2);//比较
        System.out.println(result);

        BigInteger pow = bd2.pow(3);//次幂
        System.out.println(pow);

        bd1.max(bd2);//取最大值
        bd1.min(bd2);//取最小值

        BigInteger bd3= BigInteger.valueOf(1000);
        bd1.intValue();//转整数

    }
}
