package Test;
//小明爬台阶,小明有时候一次爬一个台阶,有时候一次爬两个台阶,一次爬三个台阶,20层台阶,有多少钟情况;
public class TestDemo5 {
    public static void main(String[] args) {
        System.out.println(getsum(20));
    }
     public static int getsum(int count){
        if(count==1){
            return 1;
        }
         if(count==2){
             return 2;
         }
         if(count==3){
             return 4;
         }
         return getsum(count-1)+getsum(count-2)+getsum(count-3);
     }
}
