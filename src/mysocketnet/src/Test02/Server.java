package Test02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端的连接
        Socket socket = ss.accept();
        //从连接通道中获取输入流
        InputStream is = socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        //读入数据
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char) b);
        }
        //写出反馈
        String s="遇见你也很开心`";
        OutputStream os = socket.getOutputStream();
        os.write(s.getBytes());



        ss.close();
        socket.close();

    }
}
