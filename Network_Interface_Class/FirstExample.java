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
import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;
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



//Example

// Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();


// while (interfaces.hasMoreElements()) {
//         NetworkInterface ni = interfaces.nextElement();

//         System.out.println(ni);

       //    }













         /*
         
       Understanding the Program Step by Step
Let's break it down.
Step 1
Enumeration<NetworkInterface> interfaces =
        NetworkInterface.getNetworkInterfaces();

Java asks:
"Give me all network interfaces available on this computer."

Step 2
while (interfaces.hasMoreElements())

This asks:
"Are there more network interfaces?"

If yes, continue.
Step 3
NetworkInterface ni =
        interfaces.nextElement();

This gets the next interface.
Step 4
System.out.println(ni);

Prints information about that interface.
16. Factory Methods Summary
At this point, remember these four:
Method	Purpose
getByName()	Finds interface by name
getByIndex()	Finds interface by index
getByInetAddress()	Finds interface associated with an IP address
getNetworkInterfaces()	Gets all available network interfaces


Easy way to remember
getByName()
      ↓
"name"

getByIndex()
      ↓
"number"

getByInetAddress()
      ↓
"IP address"

getNetworkInterfaces()
      ↓
"all interfaces"  
         
         
         */













/*

Now: Getter Methods
After obtaining a NetworkInterface object, we can retrieve information about it.
Important getter methods include:
getName()
getDisplayName()
getIndex()
getInetAddresses()
getInterfaceAddresses()

*/










     }

}
  

// program to extract part of URI.


