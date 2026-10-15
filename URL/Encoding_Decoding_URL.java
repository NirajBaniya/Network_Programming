
// URL Encoding and Decoding in Java

package URL;
public class Encoding_Decoding_URL {
    
    public static void main(String[] args) throws Exception {
         System.out.println("URL Encoding and Decoding Example");
         
         String originalString = "Hello World! This is a test string with special characters: @#$%^&*()";
         
         // Encoding the URL
         String encodedString = java.net.URLEncoder.encode(originalString, "UTF-8");
         System.out.println("Encoded URL: " + encodedString);
         
         // Decoding the URL
         String decodedString = java.net.URLDecoder.decode(encodedString, "UTF-8");
         System.out.println("Decoded URL: " + decodedString);
         
    }
}
