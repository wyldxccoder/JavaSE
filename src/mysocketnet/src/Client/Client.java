package Client;
//客户端
import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象(客户端)
        Socket socket=new Socket("127.0.0.1",10000);
        //读取本地文件中的数据,并写到服务器当中
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\30804\\untitled5\\src\\mysocketnet\\src\\Client\\微信图片_2022111912073210.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        int len;
        byte[]bytes=new byte[1024];
        while ((len=bis.read())!=-1){
            bos.write(bytes,0,len);
        }
        //往服务器写出结束标记
        socket.shutdownOutput();
        //读入反馈
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        //释放资源
        socket.close();


    }
}
