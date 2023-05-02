package a01mathdemo1;

//判断是不是质数
public class MathDemo2 {
    public static void main(String[] args) {
        boolean b = isprime(997);
        System.out.println(b);
    }

    public static boolean isprime(int number) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {//用Math.sqrt(number)提高效率,因为number的因子在平方根的左右两边
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }

}

