package a05UDPdemo;
//广播
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建DMulticastSocket对象(快递公司)
        MulticastSocket ms=new MulticastSocket();
        //打包数据
        String str="你好呀";
        byte[] bytes = str.getBytes();
        //发送的主机IP地址
        InetAddress address= InetAddress.getByName("255.255.255.255");
        //端口号
        int port=10087;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
        //发送数据
        ms.send(dp);
        //释放资源
        ms.close();
    }
}
