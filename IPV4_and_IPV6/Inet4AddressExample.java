/*

What is Inet4Address?

Inet4Address represents an IPv4 address.

For example:

192.168.1.10

IPv4 addresses contain:

32 bits

Since:

1 byte = 8 bits

we get:

32 bits ÷ 8 = 4 bytes

Therefore:

IPv4 = 4 bytes
4. IPv4 Structure

An IPv4 address looks like:

192.168.1.10

It contains four numerical parts called octets:

192    168    1    10
↓      ↓     ↓     ↓
8-bit  8-bit 8-bit 8-bit

Therefore:

8 + 8 + 8 + 8 = 32 bits

Each octet can have a value from:

0 to 255

because 8 bits can represent:

2^8 = 256

values:

0 through 255


*/










package IPV4_and_IPV6;
import java.net.Inet4Address;
import java.net.InetAddress;



public class Inet4AddressExample {

    public static void main(String[] args) throws Exception {
        
        System.out.println("Working...");

        // InetAddress address = InetAddress.getByName("192.168.1.10");
        // System.out.println(address);  
        
        









      /*
      
  How can we check whether an address is IPv4?

Java provides:

instanceof

We can write:

if (address instanceof Inet4Address) {
    System.out.println("IPv4 address");
}
      
      */


    



    InetAddress address = InetAddress.getByName("192.168.1.10");

    if(address instanceof InetAddress){
        System.out.println("This is a IPv4 address.");
    }


    









    }

    }
