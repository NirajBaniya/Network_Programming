/*

Why does Java have separate classes?

You may ask:

Why not just use InetAddress for everything?

Because IPv4 and IPv6 have different characteristics.

For example:

IPv4 → 32 bits → 4 bytes
IPv6 → 128 bits → 16 bytes

Java therefore provides specialized classes so that programs can work with version-specific information.

But normally you can still use:

InetAddress

as the common type.

This is an example of inheritance/polymorphism.

14. Very Important: getAddress() Difference

Earlier we learned:

byte[] getAddress()

This returns the raw IP address as a byte array.

The size tells us whether it is IPv4 or IPv6.

IPv4
192.168.1.10

returns:

4 bytes
IPv6
2001:db8::1

returns:

16 bytes

*/




package IPV4_and_IPV6;

import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.Inet6Address;


public class LastExample {
    
    public static void main(String[] args) throws Exception {
        

        InetAddress address = InetAddress.getByName("google.com");

        System.out.println("Host: " + address.getHostName());

        System.out.println("IP Address: " + address.getHostAddress());

        if(address instanceof Inet4Address) {

            System.out.println("This is an IPv4 address.");
        }
         else if(address instanceof Inet6Address) {
            System.out.println("This is an IPv6 address.");
        }

        System.out.println("Raw IP Address (byte array): " + address.getAddress().length);
        

    }
}
