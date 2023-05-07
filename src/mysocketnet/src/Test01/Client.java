package Test01;
//多次发送接收
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        //创建Socket对象
        Socket socket=new Socket("127.0.0.1",10088);
       //可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        while (true) {
            os.write(sc.next().getBytes());
        }
        //释放资源


    }
}
