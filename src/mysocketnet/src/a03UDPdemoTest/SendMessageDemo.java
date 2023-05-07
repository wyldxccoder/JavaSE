package a03UDPdemoTest;
//单播
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象(快递公司)
        DatagramSocket ds=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if(s.equals("886")){
                break;
            }
            byte[] bytes = s.getBytes();
            InetAddress address= InetAddress.getByName("127.0.0.1");
            int port=10086;
            //打包数据
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
            //发送数据
            ds.send(dp);
        }
        //释放资源
        ds.close();

    }
}
