/*

con -> url.openConnection() - Opens a connection to the resource pointed to by the URL.

con.getContentType() - Returns the content type of the resource pointed to by the URL.
con.getContentLength() - Returns the content length of the resource pointed to by the URL.
con.getContentEncoding() - Returns the content encoding of the resource pointed to by the URL.
con.getDate() - Returns the date when the resource was last modified.
con.getExpiration() - Returns the expiration date of the resource pointed to by the URL.
con.getLastModified() - Returns the last modified date of the resource pointed to by the URL.


*/



package URL;

public class UrlExample {

    public static void main(String[] args) throws Exception {
        
        java.net.URL url = new java.net.URL("https://www.google.com");
        java.net.URLConnection con = url.openConnection();

        System.out.println("Content Type: " + con.getContentType());
        System.out.println("Content Length: " + con.getContentLength());
        System.out.println("Content Encoding: " + con.getContentEncoding());
        System.out.println("Date: " + con.getDate());
        System.out.println("Expiration: " + con.getExpiration());
        System.out.println("Last Modified: " + con.getLastModified());
        
        
       
    }

}
