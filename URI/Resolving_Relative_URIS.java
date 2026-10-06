package URI;



import java.net.URI;
public class Resolving_Relative_URIS {
    
    public static void main(String[] args) throws Exception {
         System.out.println("Resolving Relative URIs");
         
         URI baseURI = new URI("http://www.example.com/path/to/resource");
         URI relativeURI = new URI("../another/resource");
    
         URI resolvedURI = baseURI.resolve(relativeURI);
         
         System.out.println("Base URI: " + baseURI);
         System.out.println("Relative URI: " + relativeURI);
         System.out.println("Resolved URI: " + resolvedURI);
       



        
        
    }
}




