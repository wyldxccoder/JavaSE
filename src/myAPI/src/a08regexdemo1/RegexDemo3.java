package a08regexdemo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//爬虫
public class RegexDemo3 {
    public static void main(String[] args) {
      String s="来黑马程序员学习java,电话:18512516758,18512508907,座机电话:01036517895,010-98951256,邮箱:bozai@itcast.cn";
      String regex="(1[3-9]\\d{9}])|(\\d{3}-\\d{8}$|^\\d{4}-\\d{7})";
      //1.获取正则表达式的对象
        Pattern p = Pattern.compile(regex);
        //2.获取文本匹配器的对象
        Matcher m = p.matcher(s);
        //3.利用循环获取每一个数据
        while (m.find()){
            String str = m.group();
            System.out.println(str);
        }

    }
}
