

/*

InetAddress is also a Java object, so it inherits methods from the Object class.

Important methods include:

equals()
hashCode()
toString()

Let's understand them.

*/


package T_2;

import java.net.InetAddress;
public class Object_Methods_of_InetAddress {
    
    public static void main(String[] args) throws Exception{

        // The equals() method checks whether two objects represent the same Internet address.


    //   InetAddress address1 = InetAddress.getByName("127.0.0.1");

    //   InetAddress address2 = InetAddress.getByName("127.0.0.2");

    //   System.out.println("Check: "+ address1.equals(address2));


// Because both should represent the same address.






/*

Why use equals() instead of ==?

This is a very important Java concept.

Suppose:

InetAddress a =
        InetAddress.getByName("127.0.0.1");

InetAddress b =
        InetAddress.getByName("127.0.0.1");

Using:

a == b

checks whether both variables refer to the same object instance.

Using:

a.equals(b)

checks whether they represent the same address.

For comparing object values, use:

equals()

rather than relying on ==.

*/
















// hashCode()

// hashCode() returns an integer hash value representing the object.

// for eg: 


// InetAddress address = InetAddress.getByName("127.0.0.1");

// System.out.println("Show hashcode:  " + address.hashCode());




/*

You generally don't need to manually calculate the hash code.

It is especially useful when objects are used in collections such as:

HashMap
HashSet

The important rule is:

If two InetAddress objects are equal,
their hash codes must also be equal.

*/














/*
toString()

toString() gives a textual representation of the InetAddress object.
*/
// for eg: 

// InetAddress address = InetAddress.getByName("example.com");

// System.out.println(address.toString());

// System.out.println(address);























/*
toString() vs getHostAddress()

This is a common point of confusion.
*/

//for eg:

// InetAddress address = InetAddress.getByName("example.com");

// System.out.println(address);














/*

toString() vs getHostAddress()

This is a common point of confusion.

Suppose:

InetAddress address =
    InetAddress.getByName("example.com");

Then:

System.out.println(address);

prints the object's textual representation.

Whereas:

System.out.println(address.getHostAddress());

specifically asks for the IP address as a string.

So:

toString()
   ↓
textual representation of InetAddress

getHostAddress()
   ↓
IP address only


*/









    }

}
