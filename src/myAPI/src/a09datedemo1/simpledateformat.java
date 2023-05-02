package a09datedemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateformat {
    public static void main(String[] args) throws ParseException {
        String str = "2002-08-08";
        //解析
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        //格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(date);
        System.out.println(format);

    }
}
