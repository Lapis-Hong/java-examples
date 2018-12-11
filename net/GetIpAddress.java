/*使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址*/

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.runoob.com");
        }
        catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
