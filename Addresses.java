import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class Addresses {
    
    final static String WEBADDRESS = "www.google.com"; //Try localhost
    
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName(WEBADDRESS);
            System.out.println(address.getHostName()+"-"+address.getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
    }
    
}
