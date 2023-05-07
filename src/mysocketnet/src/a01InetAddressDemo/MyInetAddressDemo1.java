package a01InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("LAPTOP-V90P2OBS");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);

        String ip = address.getHostAddress();
        System.out.println(ip);

    }
}
