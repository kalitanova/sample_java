import java.net.*;
public class IPfromDNS {

    public static void main(String[] args) {
        InetAddress omgtu = null;
        try {
            omgtu = InetAddress.getByName("omgtu.ru");
        }
        catch (UnknownHostException e) {
            System.out.println( " ошибка доступа ->" + e);
        }
        System.out.println( "IP- адрес ->" +omgtu );
    }
}