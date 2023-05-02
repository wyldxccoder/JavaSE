package golearn;

import java.util.Random;

//随机产生验证码,前四位为随机大小写字母第五位是数字
public class TEST3 {
    public static void main(String[] args) {
        char [] arr=new char[52];//定义一个存大小写字母的数组
        for (int i = 0; i < arr.length; i++) {  //遍历大小写字母 用ascll码
            if(i<=25){
                arr [i]=(char)(i+97);
            }else {
                arr [i]=(char)(i+65-26);            //一个for干一件事
            }
        }
        for (int i = 0; i < arr.length; i++) {  //输出大小写字母
        }
        //定义一个字符串类型的变量 记录最终结果
        String result=" ";
        Random r=new Random();

        for (int i = 0; i < 4; i++) {
            int a= r.nextInt(arr.length);  //生成随机索引 a
            result=result+arr[a];   //四个字母相加
        }
      int b=  r.nextInt(10);//生成一个随机数字
        result=result+b;
        System.out.println(result);
      }




}
