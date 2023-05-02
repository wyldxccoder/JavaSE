package a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(-100));
        //向上取整
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.ceil(-1.1));
        //向下取整
        System.out.println(Math.floor(1.1));
        System.out.println(Math.floor(-1.1));
        //四舍五入
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));
        //取最大值
        System.out.println(Math.max(7, 8));
        //取最小值
        System.out.println(Math.min(7, 8));
        //返回 a的b次幂
        System.out.println(Math.pow(2, 3));
        //平方根
        System.out.println(Math.sqrt(4));
        //立方根
        System.out.println(Math.cbrt(8));
        //取随机数
        System.out.println(Math.random());

    }
}
