package Test;
//猴子吃桃
public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println(getsum(1));
    }

    public static int getsum(int day) {
        if(day==10){
            return 1;
        }
        return (getsum(day+1)+1)*2;

    }
}
