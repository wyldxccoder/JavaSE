package a08regexdemo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//贪婪爬取和非贪婪爬取   ab+ ab+?
public class RegexDemo5 {
    public static void main(String[] args) {
        String s="aaaaaaaabbbbbbbbaaaaaaaaa";
        String regex="ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }

    }
}
