package Test02;
//发送并得到反馈
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket=new Socket("127.0.0.1",10000);
        String s="遇见你很开心`";
        //可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write(s.getBytes());
        //写一个结束标记
        socket.shutdownOutput();
        //读入反馈
        InputStream is = socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char) b);
        }


        socket.close();

    }
}
