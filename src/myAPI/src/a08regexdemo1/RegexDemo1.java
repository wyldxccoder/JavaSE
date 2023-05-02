package a08regexdemo1;
//正则表达式
public class RegexDemo1 {
    public static void main(String[] args) {
        //字符类,只能匹配一个字符
        //[abc],只能是a,b,c
        System.out.println("1");
        System.out.println("a".matches("[abc]"));
        //[^abc],不能是a,b,c
        System.out.println("2");
        System.out.println("a".matches("[^abc]"));
        //[a-zA-Z],a到z和A到Z
        System.out.println("3");
        System.out.println("a".matches("[a-zA-Z]"));
        //[a-z[A-Z]],a到z和A到Z
        System.out.println("4");
        System.out.println("a".matches("[a-z[A-Z]]"));
        //[a-z&&[def]],a到z与def的交集
        System.out.println("5");
        System.out.println("a".matches("[a-z&&[def]]"));
        //[a-z&&[^bc]],a到z与除bc的交集
        System.out.println("6");
        System.out.println("b".matches("[a-z&&[^bc]]"));
        //[a-z&&[^m-p]],a到z与除m到p的交集
        System.out.println("7");
        System.out.println("a".matches("[a-z&&[^m-p]]"));



        //预定义字符类,只能匹配一个字符
        //.,匹配任何字符
        System.out.println("8");
        System.out.println("你".matches("."));
        System.out.println("9");
        System.out.println("你们".matches(".."));
        //\d,匹配一个数字,在Java中\\表示一个
        System.out.println("10");
        System.out.println("a".matches("\\d"));
        //\D,匹配一个非数字
        System.out.println("11");
        System.out.println("a".matches("\\D"));
        //\s,匹配一个空白字符
        System.out.println("12");
        System.out.println(" ".matches("\\s"));
        //\S,匹配一个非空白字符
        System.out.println("13");
        System.out.println("a".matches("\\S"));
        //\w,匹配一个数字字母下划线
        System.out.println("14");
        System.out.println("a".matches("\\w"));
        //\W,匹配一个非数字字母下划线
        System.out.println("15");
        System.out.println(" ".matches("\\W"));


        //数量词
        //x?,一次或零次
        System.out.println("16");
        System.out.println("abcd".matches("\\w?"));
        //x*,零次或多次
        System.out.println("17");
        System.out.println("abcd".matches("\\w*"));
        //x+,一次或多次
        System.out.println("18");
        System.out.println("a".matches("\\w+"));
        //x{n},正好n次
        System.out.println("19");
        System.out.println("abcd".matches("\\w{4}"));
        //x{n,},至少n次
        System.out.println("20");
        System.out.println("abcde".matches("\\w{4,}"));
        //x{n,m},n到m次
        System.out.println("21");
        System.out.println("abc".matches("\\w{4,10}"));










    }
}
