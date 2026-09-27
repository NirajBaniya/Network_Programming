
import java.net.InetAddress;
import java.util.concurrent.Flow;

public class GetByNameExample {


    public static void main(String[] args) throws Exception {




   // 1. Passing a Host Name to getByName()        
        //  InetAddress address =
            //      InetAddress.getByName("www.google.com");

            //      System.out.println(address);   







     // 2. Passing an IP Address to getByName()
        // InetAddress address =
        //          InetAddress.getByName("8.8.8.8");

        // System.out.println(address);









// 3. getAllByName()

// A hostname can have multiple IP addresses.

// For example, a large website may have multiple servers. 
// Notice that it returns an array of InetAddress objects.  


        // InetAddress[] addresses = 
        //            InetAddress.getAllByName("www.google.com");

        //   System.out.println(addresses);



     /*  www.google.com
       |
       +---- IP 1
       |
       +---- IP 2
       |
       +---- IP 3


       The exact addresses returned can vary because modern websites often use distributed infrastructure.
*/
        





// 4. getLocalHost()
//  Java also provides:

//InetAddress.getLocalHost()

//This returns an InetAddress representing the local computer.  

        
        // InetAddress localAddress = InetAddress.getLocalHost();

        //     System.out.println(localAddress);



   /*  Understanding getByName() vs getAllByName() vs getLocalHost()    

        | Method           | Purpose                                           |
| ---------------- | ------------------------------------------------- |
| `getByName()`    | Gets one address for a hostname                   |
| `getAllByName()` | Gets all resolved addresses for a hostname        |
| `getLocalHost()` | Gets the address information of the local machine |


Easy way to remember

getByName()
     ↓
one address

getAllByName()
     ↓
multiple addresses

getLocalHost()
     ↓
my computer




   */


 












  // Getter Methods of InetAddress
   /* Once you have an InetAddress object, you can retrieve information from it.

         The important getter methods are:

                    getHostName()
                    getCanonicalHostName()
                    getHostAddress()
                    getAddress()

     1. getHostName()

This method returns the hostname associated with the address.

Syntax
address.getHostName();               


*/


//  InetAddress address = InetAddress.getByName("www.google.com");

//         System.out.println("Host Name: " + address.getHostName());




      //  Possible output:   www.google.com






/*       2. getCanonicalHostName()

This method returns the fully qualified canonical hostname, if it can be determined.

Syntax
address.getCanonicalHostName();

 */


        // InetAddress address = InetAddress.getByName("www.google.com");

        // System.out.println("Canonical Host Name: " + address.getCanonicalHostName());

    

   // The returned name may differ from the original hostname depending on DNS configuration.  


//    Difference
// getHostName()
//         ↓
// hostname associated with address

// getCanonicalHostName()
//         ↓
// canonical/fully qualified hostname
   
   





/*  3. getHostAddress()

This is one of the most important methods.

It returns the IP address in string form.

Syntax
address.getHostAddress();

*/


    // InetAddress address = InetAddress.getByName("www.google.com");

    //     System.out.println("Host Address: " + address.getHostAddress());  







// 4. getAddress()

// This method returns the raw IP address as a byte array.

// Syntax
// byte[] ip = address.getAddress();    


      
    //   InetAddress address = InetAddress.getByName("8.8.8.8");

    //   byte[] ip = address.getAddress();

    //   for(byte b : ip) {
    //   System.out.println(b);
    //     }




    /* Understanding the Complete Flow



                   Java Program
                    |
                    ↓
       getByName("www.example.com")
                    |
                    ↓
                  DNS
                    |
                    ↓
              IP Address
                    |
                    ↓
             InetAddress
                 Object
                    |
          +---------+---------+
          |         |         |
          ↓         ↓         ↓
     Host Name   IP Address  Canonical


      */







     /*
     
     Important Exceptions

Networking operations can fail.



For example:

hostname does not exist
DNS cannot resolve the hostname
network configuration problem





Therefore, many InetAddress methods can throw:

UnknownHostException
     
     */


  /*
       Remember
getByName()
→ one InetAddress

getAllByName()
→ array of InetAddress

getLocalHost()
→ local computer address

getHostName()
→ hostname

getCanonicalHostName()
→ canonical hostname

getHostAddress()
→ IP address as String

getAddress()
→ IP address as byte[]
  
  */   
 








    }
}