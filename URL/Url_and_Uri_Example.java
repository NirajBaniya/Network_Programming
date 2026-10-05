
package URL;

public class Url_and_Uri_Example {
    
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("https://www.google.com");

    
        java.net.URI uri = url.toURI();


        System.out.println("URL: " + url);
        System.out.println("URI: " + uri);
        
    }
}
