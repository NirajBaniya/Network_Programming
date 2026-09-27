


package T_2;

import java.net.InetAddress;


public class AddressType {
    
      public static void main(String[] args) throws Exception {
        System.out.println("Address Type Example");



        /*

Any Local Address
What is an Any Local Address?

An any local address means that a server is willing to listen on any local network interface/address.

For IPv4, the address is:

0.0.0.0

For IPv6, it is:

::

For example, a server may bind to:

0.0.0.0:8080

This means:

"Accept connections arriving through any available IPv4 network interface."

Java method
isAnyLocalAddress()
*/





// InetAddress address = InetAddress.getByName("0.0.0.0");

//     System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());












/*

Loopback Address


What is Loopback?

A loopback address refers back to the same computer.

It is mainly used when a computer communicates with itself.

The most common IPv4 loopback address is:

127.0.0.1

You may have used this when developing Spring Boot applications:

localhost:8080

Here:

localhost
   ↓
127.0.0.1
   ↓
your own computer

IPv6 has:

::1



as the loopback address.


Java method
isLoopbackAddress()

*/

   
//    InetAddress address = InetAddress.getByName("127.0.0.1");

//    System.out.println("Is Loopback Address: " + address.isLoopbackAddress());








/*
 
Why is loopback useful?

Suppose you are developing a web application:

Browser
   |
   ↓
localhost:8080
   |
   ↓
Your computer
   |
   ↓
Spring Boot

No external computer is necessarily involved.

Loopback is therefore very useful for:

testing
software development
local servers
debugging network applications

*/












/*

Link-Local Address

A link-local address is an address automatically used for communication within the local network link when normal address configuration is unavailable or not being used.

For IPv4, link-local addresses are in:

169.254.0.0 – 169.254.255.255

For IPv6, link-local addresses generally begin with:

FE80::

Example IPv4:

169.254.10.20

Java provides:

isLinkLocalAddress()

*/


// InetAddress address = InetAddress.getByName("169.254.11.22");

// System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());














/*

Site-Local Address


A site-local address refers to a private address intended for use within a local network rather than being directly routable on the public Internet.

Common IPv4 private ranges include:

10.0.0.0/8

172.16.0.0/12

192.168.0.0/16

For example:

192.168.1.10

is a typical private IPv4 address.

Java provides:

isSiteLocalAddress()

*/

// InetAddress address = InetAddress.getByName("192.168.1.11");

//  System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());



/*

Important distinction

Do not confuse:

Site-local/private

with:

Public Internet address

For example:

192.168.1.10

is private.

Whereas:

8.8.8.8

is a public IPv4 address.

*/


















/*

6. Multicast Address
What is multicast?

Normally, communication can be:

One sender → One receiver

This is unicast.

But multicast allows:

One sender
     |
     +---- Receiver A
     +---- Receiver B
     +---- Receiver C

The sender sends data to a group of receivers.

IPv4 multicast range

IPv4 multicast addresses are:

224.0.0.0 – 239.255.255.255

For example:

224.0.0.1

Java provides:

isMulticastAddress()

*/


    // InetAddress address = InetAddress.getByName("224.0.0.1");

    // System.out.println("Multicaste address: " + address.isMulticastAddress());














   /*
   
   7. Summary of Address Type Methods

   | Method                 | Meaning                        | Example        |
| ---------------------- | ------------------------------ | -------------- |
| `isAnyLocalAddress()`  | Represents any local interface | `0.0.0.0`      |
| `isLoopbackAddress()`  | Refers back to local computer  | `127.0.0.1`    |
| `isLinkLocalAddress()` | Local-link address             | `169.254.x.x`  |
| `isSiteLocalAddress()` | Private/local network address  | `192.168.1.10` |
| `isMulticastAddress()` | Address used for multicast     | `224.0.0.1`    |



Easy memory trick

ANY
 ↓
0.0.0.0

LOOPBACK
 ↓
127.0.0.1

LINK-LOCAL
 ↓
169.254.x.x

PRIVATE/SITE-LOCAL
 ↓
192.168.x.x

MULTICAST
 ↓
224.x.x.x




   
   */ 


   

}   
}