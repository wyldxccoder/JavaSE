package a08regexdemo1;
//非捕获分组
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        String s="java自959年以来,经历很多版本,目前企业中最多的是Java8和JAva11," +
                "因为这两个是长期支持版本,下一个长期支持版本是JAVa17,相信JAVA17也能行";
        String regex1="((?i)java)(?=8|11|17)";//?=  查询带8 11 17 但不显示8 11 17
        String regex2="((?i)java)(?:8|11|17)";//?:  查询带8 11 17 显示8 11 17       (?!)java忽略大小写
        String regex3="((?i)java)(?!8|11|17)";//?! 查询不带 8 11 17
       // 获取正则表达式对象
        Pattern p = Pattern.compile(regex3);
        //获取文本匹配器对象
        Matcher m = p.matcher(s);
        ////利用循环获取每一个数据
        while (m.find()){
            String str = m.group();
            System.out.println(str);
        }

    }
}
