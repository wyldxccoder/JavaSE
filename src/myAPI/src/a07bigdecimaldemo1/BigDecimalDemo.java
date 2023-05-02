package a07bigdecimaldemo1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //创建BigDecimal对象
        //BigDecimal bd1=new BigDecimal("0.09");
        BigDecimal bd1=BigDecimal.valueOf(0.09);
        BigDecimal bd2=BigDecimal.valueOf(0.01);
        BigDecimal add = bd1.add(bd2);
        BigDecimal subtract = bd1.subtract(bd2);
        BigDecimal multiply = bd1.multiply(bd2);
        BigDecimal divide = bd1.divide(bd2, 2, RoundingMode.HALF_UP);//加减乘除,除法四舍五入
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}
