package 包装类;
//基本数据类型对应的对象
public class integerdemo1 {
    public static void main(String[] args) {
        //把整数转换成二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        //把整数转换成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);
        //把整数转换为十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);
        //转换,将包装类转换为基本数据类型
        int i = Integer.parseInt("123");
        System.out.println(i);

    }
}
