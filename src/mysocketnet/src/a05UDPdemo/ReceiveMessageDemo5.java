package a05UDPdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo5 {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms=new MulticastSocket(10087);
        //将当前本机,添加到224.0.0.1的这一组中
        InetAddress name = InetAddress.getByName("255.255.255.255");
        ms.joinGroup(name);
        //接收数据包
        byte[]bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        //该方法是阻塞的
        ms.receive(dp);
        //解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接收到的数据"+new String(data,0,len));
        System.out.println("该数据是从"+address+"这台电脑中的"+port+"这个端口发出的");
        ms.close();
    }
}
