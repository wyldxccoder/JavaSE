package day4;

public class MethodDemo4 {
    public static void main(String[] args) {
        //利用方法重载的思想,设计两个整数是否相同的方法
        sum(10,20);
        sum((byte)10,20);

    }
    public  static void sum(byte a1,byte a2) {
        System.out.println(a1 == a2);
    }
    public  static void sum(short b1,short b2) {
        System.out.println(b1 == b2);
    }
    public  static void sum(int c1,int c2) {
        System.out.println(c1 == c2);
    }
    public  static void sum(long d1,long d2) {
        System.out.println(d1 == d2);
    }



}
