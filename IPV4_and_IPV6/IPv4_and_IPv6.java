

package IPV4_and_IPV6;

import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.Inet6Address;

public class IPv4_and_IPv6 {
    
       public static void main(String[] args) throws Exception {
        
        InetAddress address = InetAddress.getByName("192.168.10.1");
        
        if (address instanceof Inet4Address) {
            System.out.println("IPv4");
        }

        else if(address instanceof Inet6Address) {
            System.out.println("IPv6");
        }

       }

}


/*
The logic is:

             InetAddress
                  |
          What type is it?
             /       \
            /         \
        IPv4           IPv6
         |               |
Inet4Address       Inet6Address
*/