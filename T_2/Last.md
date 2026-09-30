One Important Mental Picture

You should now think of an InetAddress object like this:


                 InetAddress
                     Object
                       |
        +--------------+--------------+
        |              |              |
     Hostname       IP Address      Address Type
        |              |              |
 example.com      93.x.x.x       Public/private/
                                 loopback/etc.
                       |
                       ↓
                Network operations
                       |
                 isReachable()





                 