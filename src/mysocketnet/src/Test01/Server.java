package Test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss=new ServerSocket(10088);
        //监听客户端的连接
        Socket socket = ss.accept();
        //从连接通道中获取输入流
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //读入数据
        int len;
        while ((len=br.read())!=-1){
            System.out.print((char) len);
            System.out.println();
        }
        //释放资源
        br.close();
        ss.close();

    }
}
