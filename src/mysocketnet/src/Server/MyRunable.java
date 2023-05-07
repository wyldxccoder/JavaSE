package Server;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunable implements Runnable{
    Socket socket;
    MyRunable (Socket socket){
       this.socket=socket;
    }
    @Override
    public void run() {
        try {
            //读取数据并保存到本地文件中
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            //UUID 解决文件重名问题
            String s= UUID.randomUUID().toString().replace("-","");
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\30804\\untitled5\\src\\mysocketnet\\src\\Server\\"+s+".jpg"));
            int len;
            byte[]bytes=new byte[1024];
            while ((len=bis.read())!=-1){
                bos.write(bytes,0,len);
            }
            //写出反馈
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if (socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }
    }
}
