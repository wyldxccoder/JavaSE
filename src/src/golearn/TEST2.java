package golearn;
//101-200素数个数
public class TEST2 {
    public static void main(String[] args) {
        int count=0;

        for(int i=101;i<=200;i++){
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(i+"是素数");
                count++;
            }
        }
        System.out.println("素数个数为"+count);
    }
}
