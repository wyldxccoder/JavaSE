package a08regexdemo1;
//捕获分组
public class RegexDemo7 {
    public static void main(String[] args) {
        String s="我要学学编编编编程程程";
        //需求:把重复的内容替换为单个
        //(.) 表示把重复内容的第一个字符看做一组
        //\\ 1表示第一个字符再次出现
        //+  至少一次
        //$1 表示把正则表达式中第一组的内容,再拿出来用
        String result = s.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }
}
