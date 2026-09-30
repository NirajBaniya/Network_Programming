2.3 Inet4Address and Inet6Address

Now we move to IPv4 and IPv6. This topic is closely connected to InetAddress, because InetAddress is the general class, while Inet4Address and Inet6Address represent the two major IP address versions.

1. First understand IPv4 and IPv6

Before Java, understand the basic networking concept.

An IP address identifies a device/interface on a network.

There are two major versions:

IPv4
IPv6
IPv4 example
192.168.1.10
IPv6 example
2001:db8::1

The major difference is the size of the address.

| Feature         | IPv4           | IPv6           |
| --------------- | -------------- | -------------- |
| Address size    | 32 bits        | 128 bits       |
| Number of bytes | 4              | 16             |
| Common notation | Decimal        | Hexadecimal    |
| Example         | `192.168.1.10` | `2001:db8::1`  |
| Java class      | `Inet4Address` | `Inet6Address` |




2. Relationship Between the Classes

This is important for understanding Java's design.

Conceptually:

                 InetAddress
                     |
          +----------+----------+
          |                     |
          ↓                     ↓
   Inet4Address             Inet6Address
      IPv4                      IPv6

InetAddress is the general class.

Inet4Address is a subclass used for IPv4 addresses.

Inet6Address is a subclass used for IPv6 addresses.

So if you have:

InetAddress address;

the actual object may internally be:

Inet4Address

or:

Inet6Address

depending on the address.



