package Test;
//不死兔神 从第三个月开始,每一个月的兔子对数是前两个月之和(斐波那契数列)
//计算前12个月的兔子对数
public class TestDemo2 {
    public static void main(String[] args) {
        int getsum = getsum(12);
        System.out.println(getsum);

    }
    public static int getsum(int mon){
        if(mon==2||mon==1){
            return 1;
        }
        return getsum(mon-1)+getsum(mon-2);
    }
}
