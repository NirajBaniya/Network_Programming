/*

Creating NetworkInterface Objects
Just like InetAddress, you generally don't create a NetworkInterface object using:
new NetworkInterface()

Instead, Java provides static factory methods.
The important ones are:
NetworkInterface.getByName()
NetworkInterface.getByIndex()
NetworkInterface.getByInetAddress()
NetworkInterface.getNetworkInterfaces()

*/





package Network_Interface_Class;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class FirstExample {
    
    public static void main(String[] args) throws Exception {
         System.out.println("-----------NetworkInterface Factory Methods-----------");
         
         // NetworkInterface.getByName()
         // NetworkInterface.getByIndex()
         // NetworkInterface.getByInetAddress()
         // NetworkInterface.getNetworkInterfaces()
         
         /* NetworkInterface.getByName()   */
         

         /*
         
         getByName()
The first method is:
NetworkInterface.getByName()

It finds a network interface using its system interface name.
Syntax
NetworkInterface ni =
NetworkInterface.getByName(String name);

For example, your computer might have an interface named:
Wi-Fi

or:
Ethernet

or a system-specific name such as:
eth0

or:
wlan0

The actual names depend on the operating system.

*/

// Example

//      NetworkInterface ni = NetworkInterface.getByName("Wi-Fi");

//      System.out.println(ni);




  
     


 /*
 8. getByIndex()
The second factory method is:
NetworkInterface.getByIndex()

A network interface can have an interface index.
Syntax
NetworkInterface ni =
        NetworkInterface.getByIndex(int index);

For example:
NetworkInterface ni =
        NetworkInterface.getByIndex(1);

The exact interface associated with an index depends on the operating system.
9. What is an Interface Index?
Think of an interface index as an identifier assigned to a network interface.
For example, conceptually:
Index       Interface

1           Ethernet
2           Wi-Fi
3           Virtual adapter

Then:
getByIndex(2)

could return the Wi-Fi interface on that particular system.
But do not assume that index 2 always means Wi-Fi.
The mapping is system-dependent.
 
 */    

//Example

// NetworkInterface ni2 = NetworkInterface.getByIndex(1);

// System.out.println(ni2);















/*
         
getByInetAddress()
This method is especially useful because it connects our previous topic, InetAddress, with NetworkInterface.
The method is:
NetworkInterface.getByInetAddress()

It finds the network interface associated with a particular IP address.
Syntax
NetworkInterface ni =
        NetworkInterface.getByInetAddress(
                InetAddress address
        );

*/


//Example

//      InetAddress address = InetAddress.getByName("192.168.1.10");

//      NetworkInterface ni3 = NetworkInterface.getByInetAddress(address);

//      System.out.println(ni3);


/*If the IP address belongs to one of your local network interfaces, Java can return that interface. */


/*
11. Understanding the Relationship
This is worth understanding carefully:
              IP Address
                  |
                  ↓
        192.168.1.10
                  |
                  ↓
     getByInetAddress()
                  |
                  ↓
         NetworkInterface
                  |
                  ↓
                Wi-Fi

So:
InetAddress

represents the address.
And:
NetworkInterface

represents the interface associated with that address.
*/


















/*

12. getNetworkInterfaces()
This is probably the most useful factory method in practical programming.
It returns an enumeration containing the network interfaces available on the computer.
Syntax
Enumeration<NetworkInterface> interfaces =
        NetworkInterface.getNetworkInterfaces();

You'll need:
import java.net.NetworkInterface;
import java.util.Enumeration;

13. Why Does It Return an Enumeration?
There may be many network interfaces.
For example:
Computer
   |
   +---- Wi-Fi
   |
   +---- Ethernet
   |
   +---- Bluetooth
   |
   +---- VirtualBox
   |
   +---- VPN

Therefore, Java returns multiple interfaces.
The return type is:
Enumeration<NetworkInterface>

You can iterate through them.


*/





/*



*/


     }

}
    

