package a06TCPdemo;
//TCP协议 接收数据 (服务器)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端的连接
        //该方法是阻塞方法
        Socket socket=ss.accept();
        //从连接通道中获取输入流
//        InputStream is = socket.getInputStream();
//        //转化流 字节流转化为字符流
//        InputStreamReader isr=new InputStreamReader(is);
//        //转化流
//        BufferedReader br=new BufferedReader(isr);
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //读出数据
        int b;
        while ((b=br.read())!=-1){
            System.out.print((char)b);
        }
        //释放资源
        br.close();
        ss.close();
    }
}
