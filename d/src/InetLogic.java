package chapt15;
import java.net.*;
public class InetLogic {
    public static void main(String[] args) {
        InetAddress myIP = null;
        InetAddress bsuIP = null;
        try {
            myIP = InetAddress.getLocalHost();
// вывод IP-адреса локального компьютера
            System.out.println("Мой IP -> "
                    + myIP.getHostAddress());
            bsuIP = InetAddress.getByName(
                    "www.normal.kz");

// вывод IP-адреса БГУ www.bsu.by
            System.out.println("BSU -> "
                    + bsuIP.getHostAddress());
        } catch (UnknownHostException e) {
// если не удается найти IP
            e.printStackTrace();
        }
    }
}
