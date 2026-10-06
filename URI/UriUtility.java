

/*

 URI -> Utility Methods


  boolean equals(URI) 
  int hashCode(URI)
  int compareTo(URI)
  string toString(URI) 
  string toASCIIString(URI)

*/




package URI;

import java.net.URI;
public class UriUtility {
    
    public static void main(String[] args)  throws Exception {
         System.out.println("-URI Utility Methods-");
         
         URI uri1 = new URI("http://www.example.com/path/to/resource");
         URI uri2 = new URI("http://www.example.com/path/to/resource");
         URI uri3 = new URI("http://www.example.com/another/resource");
         
         // equals(URI)
         System.out.println("uri1.equals(uri2): " + uri1.equals(uri2)); // true
         System.out.println("uri1.equals(uri3): " + uri1.equals(uri3)); // false
         
         // hashCode(URI)
         System.out.println("uri1.hashCode(): " + uri1.hashCode());
         System.out.println("uri2.hashCode(): " + uri2.hashCode());
         System.out.println("uri3.hashCode(): " + uri3.hashCode());
         
         // compareTo(URI)
         System.out.println("uri1.compareTo(uri2): " + uri1.compareTo(uri2)); // 0
         System.out.println("uri1.compareTo(uri3): " + uri1.compareTo(uri3)); // negative value
         
         // toString(URI)
         System.out.println("uri1.toString(): " + uri1.toString());
         
         // toASCIIString(URI)
         System.out.println("uri1.toASCIIString(): " + uri1.toASCIIString());
        
    }
}
