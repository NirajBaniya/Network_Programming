2.4 The NetworkInterface Class
Now we move to NetworkInterface, which is an important part of Java network programming.
So far, we learned that:
InetAddress
    ↓
represents an IP address

Now:
NetworkInterface
    ↓
represents a network interface

A network interface is basically the network connection/adapter through which your computer communicates with a network.
1. What is a Network Interface?
Your computer may have several network interfaces.
For example:
Computer
   |
   +---- Wi-Fi
   |
   +---- Ethernet
   |
   +---- Bluetooth
   |
   +---- Virtual adapters

On a typical laptop, you might have:
Wi-Fi adapter
Ethernet adapter
VirtualBox adapter
VPN adapter

Each interface can have one or more IP addresses.
For example:
Wi-Fi
  |
  +---- 192.168.1.20
  |
  +---- IPv6 address

Ethernet
  |
  +---- 192.168.1.21

Java provides the:
NetworkInterface

class to work with these network interfaces.
It belongs to:
java.net

So we import it using:
import java.net.NetworkInterface;

2. Definition
Exam definition
NetworkInterface is a Java class in the java.net package that represents a network interface or adapter on a computer and provides methods for obtaining information about its name, addresses, status, and configuration.

3. InetAddress vs NetworkInterface
This distinction is extremely important.
InetAddress
Represents an IP address.
Example:
192.168.1.10

NetworkInterface
Represents the network interface/adapter.
Example:
Wi-Fi
Ethernet

Think:
NetworkInterface
       |
       +------ Wi-Fi
       |
       +------ IP address
               |
               +---- 192.168.1.10

So:
NetworkInterface → network adapter
InetAddress      → IP address

4. Why Do We Need NetworkInterface?
Suppose you want your Java program to find:
- Wi-Fi interface
- Ethernet interface
- interface name
- interface