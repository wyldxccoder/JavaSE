package a06TCPdemo;
//TCP协议 发送数据 (客户端)
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        //细节:在创建对象的同时会链接服务器
        //如果连不上服务器会报错
        Socket socket=new Socket("127.0.0.1",10000);
        //可以从连接通道中获取输出流
        OutputStream os=socket.getOutputStream();
        //写入数据
        os.write("你好你好".getBytes());
        //释放资源
        os.close();
        socket.close();
    }
}
