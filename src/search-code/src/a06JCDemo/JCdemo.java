package a06JCDemo;
//递归算法 (方法里面调用方法)
//核心:1.找出口2.找规律
//方法里面调用方法的时候必须更加靠近出口
public class JCdemo {
    public static void main(String[] args) {
        System.out.println(getJC(5));
    }

    private static int getJC(int number) {
        if (number == 1) {
            return 1;//出口(结束条件)
        }

        return number*getJC(number-1);
    }
}
