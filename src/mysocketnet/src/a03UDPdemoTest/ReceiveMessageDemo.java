package a03UDPdemoTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象(快递公司)端口号保持一致
        DatagramSocket ds=new DatagramSocket(10086);
        byte[]bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        while (true) {
            //接收数据
            ds.receive(dp);
            //解析数据
            byte[] data = dp.getData();
            String ip = dp.getAddress().getHostAddress();
            String hostName = dp.getAddress().getHostName();
            int len = dp.getLength();
            int port = dp.getPort();

            System.out.println("ip为"+ip+"主机名为"+hostName+"端口号为"+port+"的人发送了数据"+new String(data,0,len));
        }

    }
}
