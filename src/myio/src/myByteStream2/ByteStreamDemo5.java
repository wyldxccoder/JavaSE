package myByteStream2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str="ai你哟";
        byte[]bytes1=str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[]bytes2=str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        //解码
        String str2=new String(bytes1);
        System.out.println(str2);
        String str3=new String(bytes1,"GBK");
        System.out.println(str3);
        String str4=new String(bytes2,"GBK");
        System.out.println(str4);

    }
}
