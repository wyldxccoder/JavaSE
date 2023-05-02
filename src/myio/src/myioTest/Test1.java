package myioTest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test1 {
    public static void main(String[] args) {
        /*https://www.diyifanwen.com/tool/baijiaxing/*/
    }
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb=new StringBuilder();
        URL url=new URL(net);
        URLConnection conn = url.openConnection();
        InputStreamReader isr=new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch=isr.read())!=-1){
            sb.append((char)ch);

        }

        return sb.toString();
    }
}
