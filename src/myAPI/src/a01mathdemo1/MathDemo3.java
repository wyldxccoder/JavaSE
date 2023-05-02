package a01mathdemo1;

//求水仙花个数
public class MathDemo3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                System.out.println("水仙花" + sum);
                count++;
            }
        }
        System.out.println("水仙花的个数为" + count);
    }
}
