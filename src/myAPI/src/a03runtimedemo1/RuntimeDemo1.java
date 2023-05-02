package a03runtimedemo1;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Runtime的对象
        Runtime r1=Runtime.getRuntime();
        //2.exit 停止虚拟机
       // Runtime.getRuntime().exit(0);
        //3.获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //4.总内存的大小  单位byet字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        //5.已经获取的总内存大小  单位byet字节
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        //6.剩余内存的大小\
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        //7.运行cmd命令
        Runtime.getRuntime().exec("notepad");
       // Runtime.getRuntime().exec("shutdown -s -t 18000 ");//18000秒后关机,shutdown -a 停止关机
    }
}
