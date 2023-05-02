package day2;
//逢7必过
public class fortest1 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if(i%10==7||i%7==0||i/10==7){ //71  17 7的倍数
                System.out.println("过");
            }
            System.out.println(i);

        }

    }
}
