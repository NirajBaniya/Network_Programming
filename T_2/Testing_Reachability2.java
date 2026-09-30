

/*

Testing Reachability

Now we come to an important method:

isReachable()
What does "reachable" mean?

Suppose you want to know whether another computer can currently be reached from your computer.

For example:

Your Computer
      |
      ↓
   Network
      |
      ↓
Another Host

Java can attempt to test whether the destination is reachable.

The method is:

isReachable()

*/


package T_2;

import java.net.InetAddress;

public class Testing_Reachability2 {
    

    public static void main(String[] args) throws Exception{

        System.out.println("Working....");




        /*
        isReachable(int timeout)

The basic form is:

isReachable(int timeout)

The timeout is specified in milliseconds.

For example:

boolean result =
        address.isReachable(5000);

means:

Try to determine whether the host is reachable, allowing up to approximately 5000 milliseconds for the attempt.

        */


    //   InetAddress address = InetAddress.getByName("google.com");

    //   boolean reachable = address.isReachable(5000);

    //   System.out.println("Reachable: " + reachable);



    
    /*
    
    Important: isReachable() Does NOT Guarantee Internet Availability

This is an important conceptual point.

If:

isReachable()

returns:

false

it does not necessarily mean that the computer is completely offline.

Why?

Because reachability testing can depend on:

operating system behavior
firewall rules
network configuration
ICMP permissions
routing
network interface configuration
Java/platform implementation

So you should understand it as:

Java is attempting to determine whether the destination can be reached within the specified timeout.

Not:

"This method is a perfect Internet connection test."

    */






















/*

Timeout

Suppose we write:

address.isReachable(5000);

Here:

5000 milliseconds
       ↓
5 seconds

Some examples:

isReachable(1000)

= approximately 1 second timeout

isReachable(5000)

= approximately 5 seconds

isReachable(10000)

= approximately 10 seconds

*/
















/*

Another Form of isReachable()

There is also a more advanced form:

isReachable(NetworkInterface netif,
            int ttl,
            int timeout)

It allows you to specify:

which network interface to use
TTL (Time To Live)
timeout

Conceptually:

address.isReachable(
    networkInterface,
    ttl,
    timeout
);

For beginner-level programming, the simpler form is usually enough:

address.isReachable(5000);

We will understand NetworkInterface separately in Section 2.4.

*/


    }

}
