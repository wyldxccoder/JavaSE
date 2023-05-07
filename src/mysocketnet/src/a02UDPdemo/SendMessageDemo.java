package a02UDPdemo;
//单播
import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象(快递公司)
        //细节
        //绑定端口,以后我们就是从这个端口往外发送
        //空参:所有可用的端口中随机一个使用
        //有参:指定端口号进行绑定ba
        DatagramSocket ds=new DatagramSocket();
        //打包数据
        String str="你好呀";
        byte[] bytes = str.getBytes();
        //发送的主机IP地址
        InetAddress address= InetAddress.getByName("127.0.0.1");
        //端口号
        int port=10086;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();

    }
}
