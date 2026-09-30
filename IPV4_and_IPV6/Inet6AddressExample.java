/*

What is Inet6Address?

Inet6Address represents an IPv6 address.

IPv6 was developed to provide a much larger address space than IPv4.



IPv6 addresses contain:

128 bits


Since:

1 byte = 8 bits


we get:

128 ÷ 8 = 16 bytes


Therefore:

IPv6 = 16 bytes
8. IPv6 Example



An IPv6 address can look like:

2001:db8:85a3:0000:0000:8a2e:0370:7334



That's quite long.

IPv6 allows a shorter representation using zero compression.

For example:

2001:db8:85a3::8a2e:370:7334

The :: represents one or more groups of zeros.




9. IPv6 Structure

A full IPv6 address contains eight groups.


For example:

2001:0db8:85a3:0000:0000:8a2e:0370:7334

Each group contains 16 bits.

Therefore:

8 groups × 16 bits
= 128 bits

So:

IPv6
 ↓
128 bits
 ↓
16 bytes

*/






package IPV4_and_IPV6;

import java.net.InetAddress;
import java.net.Inet6Address;

public class Inet6AddressExample {

    public static void main(String[] args) throws Exception {
        

        System.out.println("Working.....");

        InetAddress address = InetAddress.getByName("2001:db8::1");

        System.out.println("IPv6 Address: "+ address);


        if (address instanceof Inet6Address) {

            System.out.println("This is a IPv6 Address.");
            
        }
        
    }
    
}
